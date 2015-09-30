package listview.library.adit.com.loadmorepulltorefreshlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by adityaprasetio on 9/28/15.
 */
public class ListCustomAdapter extends BaseAdapter {
    private ArrayList<?>arrayList=new ArrayList<>();
    private Context context;
    private RowView rowView;

    public ListCustomAdapter(Context context,ArrayList<?>arrayList, RowView rowView) {
        this.context=context;
        this.arrayList=arrayList;
        this.rowView=rowView;
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
        convertView=rowView.getRow(context, arrayList.get(position));
        return convertView;
    }

    public interface RowView{
        public View getRow(Context context, Object o);
    }
}
