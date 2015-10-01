package listview.library.adit.com.loadmorepulltorefreshlistview.network;

import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import listview.library.adit.com.loadmorepulltorefreshlistview.utility.ApplicationConstant;
import listview.library.adit.com.loadmorepulltorefreshlistview.utility.Clog;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Admin123 on 10/1/15.
 */
public class RestClient {
    private static ApiNetwork REST_CLIENT;

    static {
        setupRestClient();
        Clog.e("CALL SETUP");
    }

    public RestClient() {
    }

    public static ApiNetwork get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(ApplicationConstant.HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(ApplicationConstant.HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(ApplicationConstant.HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
        RestAdapter.Builder builder = new RestAdapter.Builder()
//                .setEndpoint(Utility.getInstance().isDemoVersion(MeApplication.getInstance()) ? Config.DEMO_SERVER_NAME : Config.REAL_SERVER_NAME)
                .setEndpoint(Config.REAL_SERVER_NAME)
                .setClient(new OkClient(okHttpClient))
                .setLogLevel(RestAdapter.LogLevel.NONE);

        if(Clog.isDebugable())
            builder.setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();

        REST_CLIENT = restAdapter.create(ApiNetwork.class);
    }
}