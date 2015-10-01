package listview.library.adit.com.loadmorepulltorefreshlistview.network;

/**
 * Created by Dede Pradana on 1/15/2015.
 * at time 15:56.
 */
@SuppressWarnings("unused")
public class BaseCallback {

    public static final int SUCCESS = 200;
    public static final int UPDATE_DATA = 201;
    public static final int SESSION_EXPIRED = 403;
    public static final int DATA_REVISED = 400;
    public static final int DEFAULT_ERROR = 404;
    public static final int NETWORK_ERROR = 414;
    public static final int FORCE_UPDATE = 444;

    public static int LISTING_CALLBACK = 0;

    private int code;
    private int indexId;
    private String id;
    private String message;
    private String errors;
    private int eventCode;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return null == message ? "" : message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
