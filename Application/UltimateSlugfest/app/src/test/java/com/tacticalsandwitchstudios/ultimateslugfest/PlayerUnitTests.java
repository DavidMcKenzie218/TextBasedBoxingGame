package com.tacticalsandwitchstudios.ultimateslugfest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 03/09/2016.
 */
public class PlayerUnitTests {

    Player player;

    @Before
    public void before(){
        player = new Player("David");
    }

    @Test
    public void playerHasAName(){
        assertEquals("David", player.getName());
    }

    @Test
    public void playerHasHealth(){
        assertEquals(100, player.getHealth());
    }

    @Test
    public void playerHasLightAttackValue(){
        assertEquals(10, player.getLightAttackValue());
    }

    @Test
    public void playerHasHeavyAttackValue(){
        assertEquals(15, player.getHeavyAttackValue());
    }

    @Test
    public void playerHasSpecialAttackValue(){
        assertEquals(25, player.getSpecialAttackValue());
    }

    @Test
    public void playerDosentHavePowerUp(){
        assertEquals(false, player.hasThePlayerGotPowerUp());
    }

    @Test
    public void playerHasUsedALightAttack(){
        assertEquals("Light Punch", player.playerHasUsedLightAttack(0));
    }

    @Test
    public void playerHasUsedAHeavyAttack(){
        assertEquals("Heavy Punch", player.playerHasUsedHeavyAttack(0));
    }

    @Test
    public void playerHasUsedASpecialAttack(){
        assertEquals("Special Punch", player.playerHasUsedSpecialAttack(0));
    }

    @Test
    public void playerHasMissed(){
        assertEquals("Miss", player.playerHasMissed(0));
    }

}
