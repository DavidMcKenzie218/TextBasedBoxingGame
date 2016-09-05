package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 05/09/2016.
 */
public class Intermission {

    String[] mBought = {"Bought"};
    String[] mPassed = {"Passed"};
    String[] mSalesPitches = {"Want to buy a Power Up?"};
    int mPowerUpRoids = 10;

    //GETTERS

    public String getBoughtOutput(int boughtNumber){
        return mBought[boughtNumber];
    }

    public String getPassedOutput(int passedNumber){
        return mPassed[passedNumber];
    }
    
    public String getSalesPitch(int salesNumber){
        return mSalesPitches[salesNumber];
    }

    public int getBoughtLength(){
        return mBought.length;
    }

    public int getPassedLength(){
        return mPassed.length;
    }

    public int getPowerUpRoidsValue(){
        return mPowerUpRoids;
    }

    public int getSalesPitchLength() {
        return mSalesPitches.length;
    }

    //LOGIC

    public String salesOutput(){
        int randomOutput = (int)(Math.random()*getSalesPitchLength());
        return getSalesPitch(randomOutput);
    }

    public String boughtOutput(){
        int randomOutput = (int)(Math.random()*getBoughtLength());
        return getBoughtOutput(randomOutput);
    }

    public String refusedOutput(){
        int randomOutput = (int)(Math.random()*getPassedLength());
        return getPassedOutput(randomOutput);
    }

}
