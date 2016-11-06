package runtracker.android.bignerdranch.com.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by Brian Casteel on 11/6/2016.
 */

public class TrackingLocationReceiver extends LocationReceiver {
    @Override
    protected void onLocationReceived(Context context, Location loc) {
        RunManager.get(context).insertLocation(loc);
    }
}
