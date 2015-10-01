package listview.library.adit.com.loadmorepulltorefreshlistview.model;

import java.util.ArrayList;

import listview.library.adit.com.loadmorepulltorefreshlistview.network.BaseCallback;

/**
 * Created by Admin123 on 9/30/15.
 */
public class ModelListing extends BaseCallback{
    private ArrayList<Row>rows;

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }


}
