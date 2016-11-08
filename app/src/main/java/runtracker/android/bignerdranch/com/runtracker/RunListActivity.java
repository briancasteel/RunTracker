package runtracker.android.bignerdranch.com.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by Brian Casteel on 11/7/2016.
 */

public class RunListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
