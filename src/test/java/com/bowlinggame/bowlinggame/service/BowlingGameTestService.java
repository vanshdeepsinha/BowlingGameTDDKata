package com.bowlinggame.bowlinggame.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameTestService {
	
	public int[] EACH_GAME_PINS_DOWN_ONE = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
	
	
	
	private BowlingGameService bowlingGameService = new BowlingGameService();
	
	@Test
    public void testGameForOnes() {
        int actualResult = bowlingGameService.evalGameScore(EACH_GAME_PINS_DOWN_ONE);
        int expected = 20;
        
        assertEquals(expected, actualResult);
    }

}
