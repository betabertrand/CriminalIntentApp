package com.bsp.bertrandsaint_preux.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by bertrandsaint-preux on 10/12/17.
 */

//this is a singleton class/object meaning that there will only be one instance of this

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) { //populates the crime lab with 100 crimes by default --- for now
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }
    public static CrimeLab get(Context context) { //creates a new crime lab if one does not exist
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID uuid) { //finds crime based off its ID
        for (Crime crime: mCrimes) {
            if (crime.getId().equals(uuid)) {
                return crime;
            }
        }
        return null;
    }
}
