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

}
