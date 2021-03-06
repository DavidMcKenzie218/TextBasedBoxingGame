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

    @Test
    public void outputForSalesPitch(){
        assertEquals("Want to buy a Power Up?", intermission.getSalesPitch(0));
    }

    @Test
    public void boughtArrayHasLength(){
        assertEquals(1, intermission.getBoughtLength());
    }

    @Test
    public void passedArrayHasLength(){
        assertEquals(1, intermission.getPassedLength());
    }

    @Test
    public void powerUpHasValue(){
        assertEquals(10, intermission.getPowerUpRoidsValue());
    }

}
