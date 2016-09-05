package com.tacticalsandwitchstudios.ultimateslugfest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 03/09/2016.
 */
public class BoneCrusherTests {

    HeavyweightBoxer boneCrusher;

    @Before
    public void before(){
        boneCrusher = new HeavyweightBoxer();
    }

    @Test
    public void boneCrusherHasName(){
        assertEquals("BoneCrusher", boneCrusher.getName());
    }

    @Test
    public void boneCrusherHasHealth(){
        assertEquals(150, boneCrusher.getHealth());
    }

    @Test
    public void boneCrusherHasTakenDamage(){
        boneCrusher.damageTaken(10);
        assertEquals(140, boneCrusher.getHealth());
    }

    @Test
    public void boneCrusherLightAttackValue(){
        assertEquals(5, boneCrusher.getLightAttackValue());
    }

    @Test
    public void boneCrusherHeavyAttackValue(){
        assertEquals(10, boneCrusher.getHeavyAttackValue());
    }

    @Test
    public void boneCrusherSpecialAttackValue(){
        assertEquals(20, boneCrusher.getSpecialAttackValue());
    }

    @Test
    public void boneCrusherUsedLightAttack(){
        assertEquals("Light Punch", boneCrusher.lightAttackOutput(0));
    }

    @Test
    public void boneCrusherUsedHeavyAttack(){
        assertEquals("Heavy Punch", boneCrusher.heavyAttackOutput(0));
    }

    @Test
    public void boneCrusherUsedSpecialAttack(){
        assertEquals("Special Punch", boneCrusher.specialAttackOutput(0));
    }
}
