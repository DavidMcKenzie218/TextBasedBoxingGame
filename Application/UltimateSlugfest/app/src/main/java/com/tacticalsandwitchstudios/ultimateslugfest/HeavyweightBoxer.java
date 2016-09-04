package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 03/09/2016.
 */
public class HeavyweightBoxer implements Enemyable {

    String mName = "BoneCrusher";
    private int mHealth = 100;
    private int mLightAttackValue = 10;
    private int mHeavyAttackValue = 15;
    private int mSpecialAttackValue = 25;

    private String[] mLightAttacks = {"Light Punch"};
    private String[] mHeavyAttacks = {"Heavy Punch"};
    private String[] mSpecialAttacks = {"Special Punch"};
    private String[] mMiss = {"Miss"};


    public HeavyweightBoxer(){

    }

    //GETTERS

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

    //INTERFACE

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

    public void damageTaken(int damage){
        mHealth = mHealth - damage;
    }
}
