package listview.library.adit.com.loadmorepulltorefreshlistview.utility;

/**
 * Created by Dede Pradana on 2/23/2015.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@SuppressWarnings("unused")
public class FileUtils {

    public static final String IMAGE_DIR = "/Pictures";
    public static final String FILE_EXTENSION = "jpg";
    private static final String FILE_NAME = "r123pro_img";

    public static File getAppDir(Context context) {
        boolean isSDPresent = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        File parent = isSDPresent ? Environment.getExternalStorageDirectory() : context.getFilesDir();
        File dir = new File(parent, IMAGE_DIR);
        if (!dir.exists()) if (!dir.mkdirs()) Clog.e("=== Error : Cannot create directory " + parent.getPath() + IMAGE_DIR);
        return dir;
    }

    public static File getFile(Context context, String name) {
        return getFile(context, name, FILE_EXTENSION);
    }

    public static File getFile(Context context, String name, String extension) {
        extension = ".".concat(extension.trim().toLowerCase(Locale.getDefault()));
        File dir = getAppDir(context);
        File myPath = new File(dir, name + extension);
        return myPath;
    }

    public static File getTempFile(Context context) {
        return getFile(context, FILE_NAME);
    }

    public static Uri getTempUri(Context context) {
        return Uri.fromFile(getTempFile(context));
    }

    public static void copyFile(File afile, File bfile) {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            inStream.close();
            outStream.close();
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File createImageFile() throws IOException {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String imageFileName = FILE_NAME + "_" + dateFormat.format(new Date());
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        return File.createTempFile(imageFileName, "." + FILE_EXTENSION, storageDir);
    }

    public static void galleryAddPic(Context context, String filePath) {
        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        File f = new File("file:" + filePath);
        Uri contentUri = Uri.fromFile(f);
        mediaScanIntent.setData(contentUri);
        context.sendBroadcast(mediaScanIntent);
    }

}
