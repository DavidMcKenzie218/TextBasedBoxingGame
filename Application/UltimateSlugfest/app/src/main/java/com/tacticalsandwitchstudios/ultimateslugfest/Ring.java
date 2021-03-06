package com.tacticalsandwitchstudios.ultimateslugfest;

import android.util.Log;

/**
 * Created by user on 03/09/2016.
 */
public class Ring {

    Player mPlayer;
    Enemyable mEnemy;

    public Ring(Player player, Enemyable enemy){
        mPlayer = player;
        mEnemy = enemy;
    }

    //TURN METHODS

    public String playerAttacks(String attack){
        int hitOrMiss =hitOrMiss(5);
        if (hitOrMiss == 1){
            return playerHasMissed();
        }else {
            return playerHasHit(attack);
        }
    }

    public String enemyAttacks(String attack, int enemyMissRate){
        int hitOrMiss = hitOrMiss(5);
        if (hitOrMiss > enemyMissRate){
            return enemyhasMissed();
        }else{
            return enemyHasHit(attack);
        }
    }

    //METHOD FOR HIT OR MISS

    public int hitOrMiss(int difficulty){
        return (int)(Math.random()*difficulty);
    }

    //PLAYER

    public String playerHasHit(String attack){
       int  attackNumber = (int)(Math.random()*playerAttackLength(attack));
        return playerAttackOutput(attackNumber, attack);
    }

    public String playerHasMissed(){
        int missNumber = (int)(Math.random()*mPlayer.missLength());
        return mPlayer.playerHasMissed(missNumber);
    }

    public int playerAttackLength(String attack){
        if (attack == "Light Attack"){
            return mPlayer.lightAttackLenght();
        }else if (attack == "Heavy Attack"){
            return mPlayer.heavyAttackLength();
        } else if (attack == "Special Attack"){
            return mPlayer.specialAttackLength();
        }else{
            return -1;
        }
    }

    public String playerAttackOutput(int attackNumber, String attack){
        if (attack == "Light Attack"){
            int playerDamage = mPlayer.getLightAttackValue();
            mEnemy.damageTaken(playerDamage);
            return mPlayer.playerHasUsedLightAttack(attackNumber);
        }else if (attack == "Heavy Attack"){
            int playerDamage = mPlayer.getHeavyAttackValue();
            mEnemy.damageTaken(playerDamage);
            return mPlayer.playerHasUsedHeavyAttack(attackNumber);
        } else if (attack == "Special Attack"){
            int playerDamage = mPlayer.getSpecialAttackValue();
            mEnemy.damageTaken(playerDamage);
            return mPlayer.playerHasUsedSpecialAttack(attackNumber);
        }else{
            return "No Attack Selected";
        }
    }

    //ENEMY

    public String enemyHasHit(String attack){
        int attackNumber = (int)(Math.random()*enemyAttackLength(attack));
        return enemyAttackOutput(attackNumber, attack);
    }

    public int enemyAttackLength(String attack){
        if (attack == "Light Attack"){
            return mEnemy.lightAttackLength();
        }else if (attack == "Heavy Attack"){
            return mEnemy.heavyAttackLength();
        }else if (attack == "Special Attack"){
            return mEnemy.specialAttackLength();
        }else{
            return -1;
        }
    }

    public String enemyAttackOutput(int attackNumber, String attack){
        if (attack == "Light Attack"){
            int enemyDamage = mEnemy.getLightAttackValue();
            mPlayer.damageTaken(enemyDamage);
            return mEnemy.lightAttackOutput(attackNumber);
        }else if (attack == "Heavy Attack"){
            int enemyDamage = mEnemy.getHeavyAttackValue();
            mPlayer.damageTaken(enemyDamage);
            return mEnemy.heavyAttackOutput(attackNumber);
        }else if (attack == "Special Attack"){
            int enemyDamage = mEnemy.getSpecialAttackValue();
            mPlayer.damageTaken(enemyDamage);
            return mEnemy.specialAttackOutput(attackNumber);
        }else{
            return "No attack selected";
        }
    }

    public String enemyhasMissed(){
        int missNumber = (int)(Math.random()*mEnemy.missLength());
        return mEnemy.enemyHasMissed(missNumber);
    }

}
