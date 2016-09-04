package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 04/09/2016.
 */
public class Game {

    int mFightNumber;
    Player mPlayer;
    Enemyable mEnemy;
    Ring mRing;

    public Game(){
        mPlayer = new Player("David");
    }

    public void setupFight(){
        if(mFightNumber == 0){
            mEnemy = new HeavyweightBoxer();
        }
        mRing = new Ring(mPlayer, mEnemy);
    }

    public void gameTurn(String attack){
        while (mPlayer.getHealth() < 0 && mEnemy.getHealth() < 0){
           playerAttacksEnemy(attack);
            enemyattacksPlayer();
        }
    }

    public String playerAttacksEnemy(String attack){
        return mRing.playerAttacks(attack);
    }

    public String enemyattacksPlayer(){
        int enemyAttack = (int)(Math.random()*3);
        if (enemyAttack == 1){
            return mRing.enemyAttacks("Light Attack");
        }else if (enemyAttack == 2){
            return mRing.enemyAttacks("Heavy Attack");
        }else{
            return mRing.enemyAttacks("special Attack");
        }
    }



}
