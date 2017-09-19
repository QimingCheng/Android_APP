package com.example.jimcheng.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by jim.cheng on 2017/9/19.
 */

public class Crime {
    private UUID mId;
    private String mTile;
    private Date mDate;
    private boolean mSolved;
/* Getter and Setter  by using the Generate*/
    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTile() {
        return mTile;
    }

    public void setmTile(String mTile) {
        this.mTile = mTile;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
