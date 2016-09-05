package com.tacticalsandwitchstudios.ultimateslugfest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/09/2016.
 */
public class IntermissionTests {

    Intermission intermission;

    @Before
    public void before(){
        intermission = new Intermission();
    }

    @Test
    public void outputForPlayerBuyingPowerUp(){
        assertEquals("Bought", intermission.getBoughtOutput(0));
    }

    @Test
    public void outputForPlayerNotBuyingPowerUp(){
        assertEquals("Passed", intermission.getPassedOutput(0));
    }


}
