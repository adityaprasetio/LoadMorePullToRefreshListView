package listview.library.adit.com.loadmorepulltorefreshlistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SimpleAdapter;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private LoadPullListView loadPullListView;
    private ArrayList<String>arrayList=new ArrayList<>();
    private ListCustomAdapter listCustomAdapter;

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
                initData();
                Log.e("","loadMoreData()");
                listCustomAdapter.notifyDataSetChanged();

            }
        });
    }
    private void initData(){
        for (int x=0;x<30;x++){
            arrayList.add(x+"");
        }
        Log.e("","LOADING DATA");
        loadPullListView.onLoadDataSuccess();
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
