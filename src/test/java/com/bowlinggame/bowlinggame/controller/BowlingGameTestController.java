package com.bowlinggame.bowlinggame.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.when;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.bowlinggame.bowlinggame.service.BowlingGameService;

@WebMvcTest
public class BowlingGameTestController {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private BowlingGameService bowlingGameService;
	
	@Test
	public void testForApiFound() throws Exception {
		when(bowlingGameService.evalGameScore(Mockito.any())).thenReturn(20);
		mvc.perform(MockMvcRequestBuilders.get("/getScore?game=1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1"))
		.andExpect(status().is(200));
	}

}
