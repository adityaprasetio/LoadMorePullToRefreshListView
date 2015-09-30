package listview.library.adit.com.loadmorepulltorefreshlistview.model;

import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Admin123 on 9/30/15.
 */
public class ModelListing {
    JSONArray response=null;
    private ArrayList<Row>rows;

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public void httpGet(String url){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onStart() {
                Log.e("", "AsyncHttpClient onStart======>>>>");
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
                Log.e("","AsyncHttpClient onFailure======>>>>"+errorResponse.toString());
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject jsonResponse) {
                // If the response is JSONObject instead of expected JSONArray
                Log.e("","AsyncHttpClient JSONObject======>>>>"+jsonResponse.toString());
//                response=jsonResponse;
                ModelListing modelListing=new Gson().fromJson(jsonResponse.toString(), ModelListing.class);
                Log.e("","AsyncHttpClient JSONObject======>>>>"+modelListing.getRows().get(0).getTitle());
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray jsonResponse) {
                // Pull out the first event on the public timeline
                Log.e("","AsyncHttpClient JSONArray======>>>>"+jsonResponse.toString());
//                response=jsonResponse;

            }
        });

//        return response;
    }
}
