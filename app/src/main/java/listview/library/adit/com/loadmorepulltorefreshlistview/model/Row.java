package listview.library.adit.com.loadmorepulltorefreshlistview.model;

import java.io.Serializable;

/**
 * Created by Admin123 on 9/30/15.
 */
public class Row implements Serializable{
    private String id;
    private String created;
    private String title;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
