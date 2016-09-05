package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 05/09/2016.
 */
public class Intermission {

    String[] mBought = {"Bought"};
    String[] mPassed = {"Passed"};

    public String getBoughtOutput(int boughtNumber){
        return mBought[boughtNumber];
    }

    public String getPassedOutput(int passedNumber){
        return mPassed[passedNumber];
    }

}
