package listview.library.adit.com.loadmorepulltorefreshlistview;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import listview.library.adit.com.loadmorepulltorefreshlistview.utility.CameraUtility;
import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActionBarActivity {
    private LoadPullListView loadPullListView;
    private ArrayList<String>arrayList=new ArrayList<>();
    private ListCustomAdapter listCustomAdapter;
    @InjectView(R.id.btCamera)Button btCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadPullListView=(LoadPullListView)findViewById(R.id.view);
        initData();
        listCustomAdapter=new ListCustomAdapter(this,arrayList);
        loadPullListView.getListView().setAdapter(listCustomAdapter);
        loadPullListView.setLoadMoreData(new LoadPullListView.LoadMoreData() {
            @Override
            public void loadMoreData() {
                loadMore();
                Log.e("", "loadMoreData()");
            }
        });

        btCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraUtility.getInstance().takePicture(MainActivity.this);
            }
        });
    }
    private void initData(){
        loadPullListView.onLoadingData();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 30; x++) {
                    arrayList.add(x + "");
                }
                Log.e("", "LOADING DATA");
                listCustomAdapter.notifyDataSetChanged();
                loadPullListView.onLoadDataSuccess();
            }
        }, 5000);

    }

    private void loadMore(){
        loadPullListView.onLoadingData();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 30; x++) {
                    arrayList.add(x + "");
                }
                Log.e("", "LOADING DATA");
                listCustomAdapter.notifyDataSetChanged();
                loadPullListView.onLoadDataSuccess();
            }
        }, 5000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
