package com.bsp.bertrandsaint_preux.criminalintent;

import android.content.Context;

/**
 * Created by bertrandsaint-preux on 10/12/17.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    
    private CrimeLab(Context context) {

    }
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab();
        }
        return sCrimeLab;
    }
}
