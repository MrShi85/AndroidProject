package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Sergey Shilkin on 27.06.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    //public static final String CRIME_LIST_POSITION = "com.bignerbranch.android.criminalintent.crime_list_position";

    @Override
    protected Fragment createFragment() {
        return CrimeListFragment.
                newInstance(getIntent().getBooleanExtra(CrimeListFragment.SAVED_SUBTITLE,false));
    }

    public static Intent newIntent(Context packageContext, boolean showSubtitle){
        Intent i = new Intent(packageContext, CrimeListActivity.class);
        i.putExtra(CrimeListFragment.SAVED_SUBTITLE, showSubtitle);
        return i;
    }
}
