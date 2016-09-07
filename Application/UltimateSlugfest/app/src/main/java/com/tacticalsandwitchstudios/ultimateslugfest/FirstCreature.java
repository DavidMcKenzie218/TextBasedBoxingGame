package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 05/09/2016.
 */
public class FirstCreature extends Enemy {

    private String[] mLightAttacks = {
            "Swiped by the Tiger",
            "A Swing with the Shark",
            "The Donkey Spat at You"
    };
    private String[] mHeavyAttacks = {
            "Mauled by the Tiger",
            "Body Slammed by the Shark"
    };
    private String[] mSpecialAttacks = {
            "The Donkey has Gone Berzerk",
            "WTF is it Doing Now"
    };
    private String[] mMiss = {
            "Succumbed to Infighting"
    };


    public FirstCreature(){
        mLightAttackValue = 5;
        mHeavyAttackValue = 10;
        mSpecialAttackValue = 20;
        mAttackRate = 10;
        mMissRate = 4;
        mName = "Boris";
        mHealth = 180;
    }

    public int lightAttackLength(){
        return mLightAttacks.length;
    }

    public int heavyAttackLength(){
        return mHeavyAttacks.length;
    }

    public int specialAttackLength(){
        return mSpecialAttacks.length;
    }

    public int missLength(){
        return mMiss.length;
    }

    public String lightAttackOutput(int attackNumber){
        return mLightAttacks[attackNumber];
    }

    public String heavyAttackOutput(int attackNumber){
        return mHeavyAttacks[attackNumber];
    }

    public String specialAttackOutput(int attackNumber){
        return mSpecialAttacks[attackNumber];
    }

    public String enemyHasMissed(int missNumber){
        return mMiss[missNumber];
    }
    
}

