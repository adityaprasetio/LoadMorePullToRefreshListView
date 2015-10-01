package listview.library.adit.com.loadmorepulltorefreshlistview.controller;

import android.content.Context;

import com.squareup.otto.Produce;

import listview.library.adit.com.loadmorepulltorefreshlistview.model.ModelListing;
import listview.library.adit.com.loadmorepulltorefreshlistview.network.RestCallback;
import listview.library.adit.com.loadmorepulltorefreshlistview.network.RestClient;
import listview.library.adit.com.loadmorepulltorefreshlistview.utility.BusProvider;
import listview.library.adit.com.loadmorepulltorefreshlistview.utility.Clog;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Admin123 on 10/1/15.
 */
public class ListingController {
    private static ListingController instance=new ListingController();
    private ListingController(){

    }
    public static ListingController getInstance(){
        return instance;
    }

    @Produce
    public void getListing(final Context context) {
        RestClient.get().getListing(new RestCallback<ModelListing>(context){
            @Override
            public void success(ModelListing o, Response response) {
                Clog.e("getListing=========>>> "+o.toString());
                BusProvider.getInstance().post(o);
            }
            @Override
            public void failure(RetrofitError error) {
                Clog.e("getListing failure=========>>> "+error);
                ModelListing modelListing=new ModelListing();
                modelListing.setCode(modelListing.NETWORK_ERROR);
                BusProvider.getInstance().post(modelListing);
            }
        });
    }
}
