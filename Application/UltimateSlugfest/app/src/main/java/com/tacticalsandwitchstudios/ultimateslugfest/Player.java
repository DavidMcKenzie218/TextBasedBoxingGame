package com.tacticalsandwitchstudios.ultimateslugfest;

import java.lang.reflect.Array;

import static java.lang.Math.random;

/**
 * Created by user on 03/09/2016.
 */
public class Player {

    private String mName;
    private int mHealth = 100;
    private int mLightAttackValue = 10;
    private int mHeavyAttackValue = 15;
    private int mSpecialAttackValue = 25;
    private boolean mPowerUpAvalible = false;

    private String[] mLightAttacks = {"Light Punch"};
    private String[] mHeavyAttacks = {"Heavy Punch"};
    private String[] mSpecialAttacks = {"Special Punch"};
    private String[] mMiss = {"Miss"};

    //GETTERS

    public Player(String name){
        mName = name;
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

    public boolean hasThePlayerGotPowerUp(){
        return mPowerUpAvalible;
    }

    //ARRAY LENGTHS

    public int lightAttackLenght(){
        return mLightAttacks.length;
    }

    public int heavyAttackLength(){
        return mHeavyAttacks.length;
    }

    public int specialAttackLength(){
        return mSpecialAttacks.length;
    }

    //ATTACKS__OUTPUT

    public String playerHasUsedLightAttack(int attackNumber){
        return mLightAttacks[attackNumber];
    }

    public String playerHasUsedHeavyAttack(int attackNumber){
        return mHeavyAttacks[attackNumber];
    }

    public String playerHasUsedSpecialAttack(int attackNumber){
        return mSpecialAttacks[attackNumber];
    }

    public String playerHasMissed(int missNumber){
        return  mMiss[missNumber];
    }



}
