package com.example.edu.presentation;

import static org.junit.Assert.*;

import java.awt.Label;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import javafx.event.ActionEvent;

public class ControllerTest {
Controller op;
int score;
Label lblScore;
	@Before
	public void setUp() throws Exception {
	op = new Controller();
	score=10;
	} 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testScore() throws Exception {
		op.Score(op);
		System.out.println(op);
		score=op.getScore();
		assertEquals(10 , score);
	}

}
