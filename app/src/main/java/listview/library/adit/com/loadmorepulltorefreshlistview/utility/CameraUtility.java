package listview.library.adit.com.loadmorepulltorefreshlistview.utility;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import java.io.File;
import java.io.IOException;

/**
 * Created by Admin123 on 9/29/15.
 */
public class CameraUtility {
    private static CameraUtility ourInstance = new CameraUtility();

    public static CameraUtility getInstance() {
        return ourInstance;
    }

    private CameraUtility() {
    }

    static final int REQUEST_TAKE_PHOTO = 1;

    public void takePicture(Activity activity) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // Ensure that there's a camera activity to handle the intent
        if (takePictureIntent.resolveActivity(activity.getPackageManager()) != null) {
            // Create the File where the photo should go
            File photoFile = null;
            try {
                photoFile = Utility.getInstance().createFile(Utility.getInstance().getApplicationName(activity) + "/Pictures", "",".jpg");
            } catch (IOException ex) {
                Log.e("","EXCEPTION====>>>"+ex);

            }
            // Continue only if the File was successfully created
            if (photoFile != null) {
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile));
                activity.startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);
            }
        }
    }
}
