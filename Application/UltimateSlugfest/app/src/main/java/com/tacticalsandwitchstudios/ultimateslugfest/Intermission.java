package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 05/09/2016.
 */
public class Intermission {

    String[] mBought = {
            "You have succumbed to temptation",
            "Here's to Hoping you don't get Caught"
    };
    String[] mPassed = {
            "Mabey Next Time",
            "I'm always around for when you give in"
    };
    String[] mSalesPitches = {
            "Psst, Want to buy a Power Up?",
            "Hey Weakling want to get Power"
    };
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
