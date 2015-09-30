package listview.library.adit.com.loadmorepulltorefreshlistview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import listview.library.adit.com.loadmorepulltorefreshlistview.ListCustomAdapter;
import listview.library.adit.com.loadmorepulltorefreshlistview.R;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

/**
 * Created by Admin123 on 9/30/15.
 */
@ContentView(R.layout.list_item)
public class ListItem implements ListCustomAdapter.RowView{
    @InjectView(R.id.textView)
    static TextView textView;

    private Context context;
    private LayoutInflater mInflater;
    private View v;
//
//    public ListItem(Context context) {
//
//    }

    @Override
    public View getRow(Context context, Object o) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
        v=mInflater.inflate(R.layout.list_item, null);
        TextView textView=(TextView)v.findViewById(R.id.textView);
        textView.setText((String)o);
        return v;
    }
}
