package com.bowlinggame.bowlinggame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bowlinggame.bowlinggame.service.BowlingGameService;

@RestController
public class BowlingGameController {

	@Autowired
	private BowlingGameService bowlingGameService;
	
	@GetMapping(path= "/getScore")
	public int gameHandler(@RequestParam int[] game) {
		return bowlingGameService.evalGameScore(game);
	}

}
