package com.tacticalsandwitchstudios.ultimateslugfest;

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

    public int hitOrMiss(int difficulty){
        return (int)(Math.random()*difficulty);
    }

    public String playerHasHit(String attack){
       int  attackNumber = (int)(Math.random()*playerAttackLength(attack));
        return playerAttackOutput(attackNumber, attack);
    }
    

    public int playerAttackLength(String attack){
        if (attack == "Light Attack"){
            return mPlayer.getLightAttackValue();
        }else if (attack == "Heavy Attack"){
            return mPlayer.getHeavyAttackValue();
        } else if (attack == "Special Attack"){
            return mPlayer.getSpecialAttackValue();
        }else{
            return 0;
        }
    }

    public String playerAttackOutput(int attackNumber, String attack){
        if (attack == "Light Attack"){
            return mPlayer.playerHasUsedLightAttack(attackNumber);
        }else if (attack == "Heavy Attack"){
            return mPlayer.playerHasUsedLightAttack(attackNumber);
        } else if (attack == "Special Attack"){
            return mPlayer.playerHasUsedSpecialAttack(attackNumber);
        }else{
            return "No Attack Selected";
        }
    }

}
