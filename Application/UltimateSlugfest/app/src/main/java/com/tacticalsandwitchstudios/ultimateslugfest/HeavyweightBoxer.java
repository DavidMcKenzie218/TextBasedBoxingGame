package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 03/09/2016.
 */
public class HeavyweightBoxer extends Enemy {



    private String[] mLightAttacks = {
            "A punch to the face",
            "A flurry of Jabs",
            "One-Two Punch to the Chest"
    };
    private String[] mHeavyAttacks = {
            "A cannon of Punch to the Face",
            "HeadButt",
            ""
    };
    private String[] mSpecialAttacks = {"Special Punch"};
    private String[] mMiss = {"Miss"};


    public HeavyweightBoxer(){
        mLightAttackValue = 5;
        mHeavyAttackValue = 10;
        mSpecialAttackValue = 20;
        mAttackRate = 9;
        mMissRate = 2;
        mHealth = 150;
        mName = "BoneCrusher";
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
