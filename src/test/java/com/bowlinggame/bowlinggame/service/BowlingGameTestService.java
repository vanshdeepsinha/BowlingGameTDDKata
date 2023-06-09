package com.bowlinggame.bowlinggame.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameTestService {
	
	public int[] EACH_GAME_PINS_DOWN_ONE = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
	
	public int[] EACH_GAME_PINS_DOWN_TWO = {2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2};
	
	public int[] SPARE_START_PINS_DOWN_TWO = {5,5, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2};
	
	public int[] STRIKE_START_PINS_DOWN_TWO = {10, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2, 2,2};
	
	private BowlingGameService bowlingGameService = new BowlingGameService();
	
	@Test
    public void testGameForOnes() {
        int actualResult = bowlingGameService.evalGameScore(EACH_GAME_PINS_DOWN_ONE);
        int expected = 20;
        
        assertEquals(expected, actualResult);
    }
	
	@Test
    public void testGameForTwos() {
    	int actualResult = bowlingGameService.evalGameScore(EACH_GAME_PINS_DOWN_TWO);
        int expected = 40;
        
        assertEquals(expected, actualResult);
    }
	
	@Test
    public void testGameForSpareAtStart() {
    	int actualResult = bowlingGameService.evalGameScore(SPARE_START_PINS_DOWN_TWO);
        int expected = 48;
        
        assertEquals(expected, actualResult);
    }
	
	@Test
    public void testGameForStrikeAtStart() {
    	int actualResult = bowlingGameService.evalGameScore(STRIKE_START_PINS_DOWN_TWO);
        int expected = 50;
        
        assertEquals(expected, actualResult);
    }

}
