package listview.library.adit.com.loadmorepulltorefreshlistview.network;

import android.content.Context;
import android.widget.Toast;


import listview.library.adit.com.loadmorepulltorefreshlistview.R;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Dede Pradana on 1/21/2015.
 */
public class RestCallback<T> implements Callback<T> {

    private final Context mContext;

    public RestCallback(Context context) {
        mContext = context;
    }

    @Override
    public void success(T o, Response response) {

    }

    @Override
    public void failure(RetrofitError error) {
        if(error.getKind() == RetrofitError.Kind.NETWORK) {
            Toast.makeText(mContext, mContext.getString(R.string.no_internet_connection), Toast.LENGTH_SHORT).show();
        }
    }
}
