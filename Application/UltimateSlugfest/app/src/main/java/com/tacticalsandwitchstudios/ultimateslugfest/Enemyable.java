package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 03/09/2016.
 */
public interface Enemyable {

    int getHealth();
    int getLightAttackValue();
    int getHeavyAttackValue();
    int getSpecialAttackValue();

    String lightAttackOutput(int attackNumber);
    String heavyAttackOutput(int attackNumber);
    String specialAttackOutput(int attackNumber);

    void damageTaken(int damage);

    int lightAttackLength();
    int heavyAttackLength();
    int specialAttackLength();

}
