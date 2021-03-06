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
        assertEquals(150, player.getHealth());
    }

    @Test
    public void playerHasLightAttackValue(){
        assertEquals(5, player.getLightAttackValue());
    }

    @Test
    public void playerHasHeavyAttackValue(){
        assertEquals(10, player.getHeavyAttackValue());
    }

    @Test
    public void playerHasSpecialAttackValue(){
        assertEquals(20, player.getSpecialAttackValue());
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

    @Test
    public void playerHasPurchasesPowerUp(){
        player.playerHasPurchasedPowerUp(10);
        assertEquals(true, player.hasThePlayerGotPowerUp());
        assertEquals(10, player.getPowerUpValue());
    }

    @Test
    public void playerHasPurchesedOnePowerUp(){
        player.playerHasPurchasedPowerUp(10);
        assertEquals(1, player.getPowerUpCount());
    }

}
