package com.bowlinggame.bowlinggame.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {
	
	private int [] rolls;
	
	private int gameScore;
	
	public int evalGameScore(int [] eachGame) {
		rolls = eachGame;
		for(int frame=0, roll=0; frame <10; frame++, roll++) {
			if (isStrike(rolls[roll])) {
				sumStrike(roll);
			} else if(isSpare(roll)) {
				sumSpare(roll);
				roll++;
		    } else {
				sumTurns(roll);
		   }
	   }
		return gameScore;
	}
	
	private boolean isStrike(int roll) {
		return roll == 10;
	}
	
	private void sumStrike(int roll) {
		gameScore += 10 + rolls[roll+1] + rolls[roll+2];
	}

	private void sumTurns(int roll) {
		gameScore += rolls[roll] + rolls[roll+1];
	}
	
	private boolean isSpare(int roll) {
		return rolls[roll] + rolls[roll+1] == 10;
	}
	
	private void sumSpare(int roll) {
	    gameScore += 10 + rolls[roll+2];
	}

}
