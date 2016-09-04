package com.tacticalsandwitchstudios.ultimateslugfest;

/**
 * Created by user on 03/09/2016.
 */
public interface Enemyable {

    int getHealth();
    int getLightAttackValue();
    int getHeavyAttackValue();
    int getSpecialAttackValue();
    int missLength();

    String lightAttackOutput(int attackNumber);
    String heavyAttackOutput(int attackNumber);
    String specialAttackOutput(int attackNumber);
    String enemyHasMissed(int missNumber);

    void damageTaken(int damage);

    int lightAttackLength();
    int heavyAttackLength();
    int specialAttackLength();

    String getName();

}
