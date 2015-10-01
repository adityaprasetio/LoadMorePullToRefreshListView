package listview.library.adit.com.loadmorepulltorefreshlistview.network;

import listview.library.adit.com.loadmorepulltorefreshlistview.model.ModelListing;
import retrofit.http.GET;

/**
 * Created by Admin123 on 10/1/15.
 */
public interface ApiNetwork {
    @GET("/db")
    void getListing(RestCallback<ModelListing> callback);
}
