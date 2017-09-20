package com.bsp.bertrandsaint_preux.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by bertrandsaint-preux on 9/18/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public UUID getId0() {
        return mId;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}
