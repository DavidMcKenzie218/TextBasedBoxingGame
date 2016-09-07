package com.tacticalsandwitchstudios.ultimateslugfest;

import java.lang.reflect.Array;

import static java.lang.Math.random;

/**
 * Created by user on 03/09/2016.
 */
public class Player {

    private String mName;
    private int mHealth = 150;
    private int mLightAttackValue;
    private int mHeavyAttackValue;
    private int mSpecialAttackValue;
    private boolean mPowerUpAvalible;
    private int mPowerUpValue;
    private int mPowerUpCount;

    private String[] mLightAttacks = {
            "A Short Sharp Jab",
            "Punch to the Arm",
            "Punch to the Chest"
    };
    private String[] mHeavyAttacks = {
            "Hook to the Jaw",
            "Uppercut",
            "A flurry of headshots"
    };
    private String[] mSpecialAttacks = {
            "Kick to the Groin",
            "Elbow to the throat"
    };
    private String[] mMiss = {
            "Slipped and Missed",
            "Distracted by the Crowd",
            "How did you miss that?"
    };

    //GETTERS

    public Player(String name) {
        mName = name;
        mLightAttackValue = 5;
        mHeavyAttackValue = 10;
        mSpecialAttackValue = 20;

    }

    public String getName() {
        return mName;
    }

    public int getHealth() {
        return mHealth;
    }

    public int getLightAttackValue() {
        return mLightAttackValue;
    }

    public int getHeavyAttackValue() {
        return mHeavyAttackValue;
    }

    public int getSpecialAttackValue() {
        return mSpecialAttackValue;
    }

    public boolean hasThePlayerGotPowerUp() {
        return mPowerUpAvalible;
    }

    public int getPowerUpValue(){
        return mPowerUpValue;
    }

    public int getPowerUpCount(){
        return mPowerUpCount;
    }

    //ARRAY LENGTHS

    public int lightAttackLenght() {
        return mLightAttacks.length;
    }

    public int heavyAttackLength() {
        return mHeavyAttacks.length;
    }

    public int specialAttackLength() {
        return mSpecialAttacks.length;
    }

    public int missLength() {
        return mMiss.length;
    }

    //SETTERS

    public void setPowerUpCount(int powerUpCount){
        mPowerUpCount = powerUpCount;
        mPowerUpAvalible = true;
    }

    //ATTACKS__OUTPUT

    public String playerHasUsedLightAttack(int attackNumber) {
        return mLightAttacks[attackNumber];
    }

    public String playerHasUsedHeavyAttack(int attackNumber) {
        return mHeavyAttacks[attackNumber];
    }

    public String playerHasUsedSpecialAttack(int attackNumber) {
        return mSpecialAttacks[attackNumber];
    }

    public String playerHasMissed(int missNumber) {
        return mMiss[missNumber];
    }

    public void damageTaken(int damage) {
        mHealth = mHealth - damage;
        if (mHealth < 0) {
            mHealth = 0;
        }
    }

    public void playerHasPurchasedPowerUp(int powerUpValue){
        mPowerUpAvalible = true;
        mPowerUpValue = powerUpValue;
        mPowerUpCount++;
    }

    public boolean hasPoweredUp(){
        if(mPowerUpAvalible == true && mPowerUpCount>0){
            return true;
        }else{
            return false;
        }
    }

}
