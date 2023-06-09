package com.bowlinggame.bowlinggame.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {
	
	private int [] rolls;
	
	private int gameScore;
	
	public int evalGameScore(int [] eachGame) {
		rolls = eachGame;
		for(int frame=0, roll=0; frame <10; frame++, roll++) {
			if(isSpare(roll)) {
				gameScore += 10 + rolls[roll+2];
				roll++;
			} else {
				sumTurns(roll);
			}
		}
		return gameScore;
	}
	
	private void sumTurns(int roll) {
		gameScore += rolls[roll] + rolls[roll+1];
	}
	
	private boolean isSpare(int roll) {
		return rolls[roll] + rolls[roll+1] == 10;
	}

}
