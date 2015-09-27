package listview.library.adit.com.loadmorepulltorefreshlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * Created by adityaprasetio on 9/28/15.
 */
public class LoadPullListView extends RelativeLayout {
    private ListView listView;
    private LinearLayout llFailed;
    private LoadMoreData loadMoreData;
    private int preLast;
    private LayoutInflater mInflater;
    private boolean isLoadingData=false;


    public LoadPullListView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
        initView();
    }

    public LoadPullListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = LayoutInflater.from(context);
        initView();
    }

    public LoadPullListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = LayoutInflater.from(context);
        initView();
    }

    private void initView(){
        View v=mInflater.inflate(R.layout.view_load_pull_listview, this, true);
        listView=(ListView)v.findViewById(R.id.listView);
        llFailed=(LinearLayout)v.findViewById(R.id.llFailed);

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView lw, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                Log.e("","==========.....>>>>>firstVisibleItem "+firstVisibleItem);
                Log.e("","==========.....>>>>>visibleItemCount "+visibleItemCount);
                Log.e("","==========.....>>>>>totalItemCount "+totalItemCount);
                if(firstVisibleItem+visibleItemCount==totalItemCount-1){
                    Log.e("","==========.....>>>>>LAST BOTTOM "+isLoadingData+totalItemCount);
                    if (!isLoadingData){
                        isLoadingData=true;
                        loadMoreData.loadMoreData();
                    }
                }
            }
        });
    }

    public void onLoadDataSuccess(){
        listView.setVisibility(View.VISIBLE);
        llFailed.setVisibility(View.GONE);
        isLoadingData=false;
    }

    public void onLoadDataFailed(ListView listView, LinearLayout llFailed){
        listView.setVisibility(View.GONE);
        llFailed.setVisibility(View.VISIBLE);
        isLoadingData=false;
    }

    public interface LoadMoreData{
        public void loadMoreData();
    }

    public ListView getListView() {
        return listView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }

    public LinearLayout getLlFailed() {
        return llFailed;
    }

    public void setLlFailed(LinearLayout llFailed) {
        this.llFailed = llFailed;
    }

    public LoadMoreData getLoadMoreData() {
        return loadMoreData;
    }

    public void setLoadMoreData(LoadMoreData loadMoreData) {
        this.loadMoreData = loadMoreData;
    }
}
