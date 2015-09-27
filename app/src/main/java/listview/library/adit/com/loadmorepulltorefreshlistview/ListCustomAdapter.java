package listview.library.adit.com.loadmorepulltorefreshlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adityaprasetio on 9/28/15.
 */
public class ListCustomAdapter extends BaseAdapter {
    private ArrayList<String>arrayList=new ArrayList<>();
    private Context context;
    private LayoutInflater mInflater;

    public ListCustomAdapter(Context context,ArrayList<String>arrayList) {
        this.context=context;
        this.arrayList=arrayList;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=mInflater.inflate(R.layout.list_item, null);
        TextView textView=(TextView)convertView.findViewById(R.id.textView);
        textView.setText(arrayList.get(position));
        return convertView;
    }
}
