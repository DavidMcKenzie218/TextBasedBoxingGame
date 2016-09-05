package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 05/09/2016.
 */
public abstract class Enemy implements Enemyable{

    String mName;
    private int mHealth;
    private int mLightAttackValue;
    private int mHeavyAttackValue;
    private int mSpecialAttackValue;
    private int mMissRate;
    private int mAttackRate;

    public Enemy(){

    }

    public String getName(){
        return mName;
    }

    public int getHealth(){
        return mHealth;
    }

    public int getLightAttackValue(){
        return mLightAttackValue;
    }

    public int getHeavyAttackValue(){
        return mHeavyAttackValue;
    }

    public int getSpecialAttackValue(){
        return mSpecialAttackValue;
    }


    public int getAttackRate(){
        return mAttackRate;
    }

    public int getMissRate(){
        return mMissRate;
    }

    //INTERFACE

    public void damageTaken(int damage){
        mHealth = mHealth - damage;
        if (mHealth < 0){
            mHealth = 0;
        }

    }
}
