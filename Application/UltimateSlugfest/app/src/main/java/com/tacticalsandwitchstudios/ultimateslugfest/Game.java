package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 04/09/2016.
 */
public class Game {

    Player mPlayer;
    Enemyable mEnemy;
    Ring mRing;

    public Game(){
        mPlayer = new Player("Challenger");
    }

    public void setupFight(int round){
        if(round == 0){
            mEnemy = new HeavyweightBoxer();
        }else if(round == 1){
            mEnemy = new FirstCreature();
        }
        mRing = new Ring(mPlayer, mEnemy);
    }

    public String playerAttacksEnemy(String attack){
        return mRing.playerAttacks(attack);
    }

    public String enemyattacksPlayer(int enemyAttackRate, int enemyMissRate){
        int enemyAttack = (int)(Math.random()*enemyAttackRate);
        if (enemyAttack == 1){
            return mRing.enemyAttacks("Special Attack", enemyMissRate);
        }else if (enemyAttack == 2){
            return mRing.enemyAttacks("Heavy Attack", enemyMissRate);
        }else{
            return mRing.enemyAttacks("Light Attack", enemyMissRate);
        }
    }

    //HEALTH

    public String getPlayerHealth(){
        return Integer.toString(mPlayer.getHealth());
    }

    public String getEnemyHealth(){
        return Integer.toString(mEnemy.getHealth());
    }

    //NAMES

    public String getPlayerName(){
        return mPlayer.getName();
    }

    public String getEnemyName(){
        return mEnemy.getName();
    }

    //STATS FOR ENEMIES

    public int getEnemyAttackRate(){
        return mEnemy.getAttackRate();
    }

    public int getEnemyMissRate(){
        return mEnemy.getMissRate();
    }

    //END GAME


    public boolean endGame(){
        if (mPlayer.getHealth() == 0 ){
            return true;
        }else if(mEnemy.getHealth() == 0){
            return true;
        }else{
            return false;
        }
    }

}

