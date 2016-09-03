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

    //ATTACK__MEHTHODS

    public void playerTriesToAttack(String moveSelected, int difficulty){
        int playerHitOrMiss =  (int)(Math.random()* difficulty);
        if(playerHitOrMiss == 1){
            playerHasMissed(0);
        }else {
            playerHasHit(moveSelected);
            }
        }


    public void playerHasHit(String moveSelected) {
        if (moveSelected == "Light Attack"){
            playerHasUsedLightAttack(0);
        } else if(moveSelected == "Heavy Attack"){
            playerHasUsedHeavyAttack(0);
        } else if (moveSelected == "Special Attack"){
            playerHasUsedSpecialAttack(0);
        }
    }

}
