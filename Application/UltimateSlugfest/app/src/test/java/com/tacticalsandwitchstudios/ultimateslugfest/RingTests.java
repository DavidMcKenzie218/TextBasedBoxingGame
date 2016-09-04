package com.tacticalsandwitchstudios.ultimateslugfest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by user on 03/09/2016.
 */
public class RingTests {

    Ring mRing;
    Player mPlayer;
    Enemyable mBoneCrusher;

    @Before
    public void before(){
        mBoneCrusher = new HeavyweightBoxer();
        mPlayer = new Player("David");
        mRing = new Ring(mPlayer, mBoneCrusher);
    }

    @Test
    public void hitOrMissWorks(){
        assertNotNull(mRing.hitOrMiss(5));
    }

    @Test
    public void playerHasHit__LightAttack(){
        assertNotNull(mRing.playerHasHit("Light Attack"));
    }

    @Test
    public void playerHasHit__HeavyAttack(){
        assertNotNull(mRing.playerHasHit("Heavy Attack"));
    }

    @Test
    public void playerHasHit__SpecialAttack(){
        assertNotNull(mRing.playerHasHit("Special Attack"));
    }

    @Test
    public void playerHasMissed(){
        assertNotNull(mRing.playerHasMissed());
    }

    @Test
    public void enemyHasHit__LightAttack(){
        assertNotNull(mRing.enemyHasHit("Light Attack"));
    }

    @Test
    public void enemyHasHit__HeavyAttack(){
        assertNotNull(mRing.enemyHasHit("Heavy Attack"));
    }

    @Test
    public void enemyHasHit__SpecialAttack(){
        assertNotNull(mRing.enemyHasHit("Special Attack"));
    }

    @Test
    public void playerHasDealtDamageToEnemy__Light(){
        mRing.playerHasHit("Light Attack");
        assertEquals(90, mBoneCrusher.getHealth());
    }

    @Test
    public void playerHasDealtDamageToEnemy__Heavy(){
        mRing.playerHasHit("Heavy Attack");
        assertEquals(85, mBoneCrusher.getHealth());
    }

    @Test
    public void playerHasDealtDamageToEnemy__Special(){
        mRing.playerHasHit("Special Attack");
        assertEquals(75, mBoneCrusher.getHealth());
    }

}
