package com.tacticalsandwitchstudios.ultimateslugfest;

import org.junit.Before;
import org.junit.Test;

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

}
