package com.bsp.bertrandsaint_preux.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by bertrandsaint-preux on 10/13/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    //this activity extends its parent SFA, that is used as an abstract class to hold all the commonalities of all the activities


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }


}
