package listview.library.adit.com.loadmorepulltorefreshlistview.utility;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin123 on 9/29/15.
 */
public class Utility {
    private static Utility ourInstance=new Utility();
    public static String DIRECTORY_PICTURE="Picture";

    public static Utility getInstance() {
//        if (ourInstance==null){
//            ourInstance = new Utility();
//        }
        return ourInstance;
    }

    private Utility() {
    }

    String mCurrentPhotoPath;


    public String getApplicationName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }



    public File createFile(String folderName, String fileName, String extension) throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        if (fileName.length()<1) {
            fileName = timeStamp + "_";
        }
        File storageDir = new File(Environment.getExternalStorageDirectory(), folderName);
        if (!storageDir.mkdirs()) {
            Log.e("", "Directory not created");
        }


        File image = File.createTempFile(
                fileName,  /* prefix */
                extension,         /* suffix */
                storageDir      /* directory */
        );

        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = "file:" + image.getAbsolutePath();
        return image;
    }

    public static boolean isDemoVersion(Context ctx) {
        String packageName = "";
        try {
            packageName = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0).packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        //Clog.d("=========package name : " + packageName);
        return packageName.endsWith(".demo");
    }
}
