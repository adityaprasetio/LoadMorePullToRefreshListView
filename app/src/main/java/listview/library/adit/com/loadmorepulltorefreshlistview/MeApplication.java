package listview.library.adit.com.loadmorepulltorefreshlistview;

import android.app.Application;
import android.content.res.Configuration;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.util.HashMap;

/**
 * Created by Dede Pradana on 1/22/2015.
 * at time 15:40.
 */
public class MeApplication extends Application {

    private static MeApplication instance;
    private HashMap<TrackerName, Tracker> mTrackers = new HashMap<>();
    private Tracker tracker;

    public static MeApplication getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        tracker = getTracker(TrackerName.GLOBAL_TRACKER);
        instance = this;

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    synchronized Tracker getTracker(TrackerName trackerId) {
        if (!mTrackers.containsKey(trackerId)) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
//            Tracker t = (trackerId == TrackerName.GLOBAL_TRACKER) ? analytics.newTracker(R.xml.global_tracker) : analytics.newTracker(R.xml.global_tracker);
//            mTrackers.put(trackerId, t);
        }
        return mTrackers.get(trackerId);
    }

    public void sendEvent(String categoryId, String actionId, String labelId) {
        tracker.send(new HitBuilders.EventBuilder().setCategory(categoryId).setAction(actionId).setLabel(labelId).build());
    }

    @SuppressWarnings("unused")
    public enum TrackerName {
        APP_TRACKER,
        GLOBAL_TRACKER,
    }

}
