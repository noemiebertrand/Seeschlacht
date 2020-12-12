package com.example.edu.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SchiffeTest {
	Schiffe op;
	int counter = 0;
	int t = (int)(Math.random() * 10 + 1);

	@Before
	public void setUp() throws Exception {
		
		op.initializeMap();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				assertSame('*', op.map [i][j]);
			}
		}
		op = new Schiffe(t, 'X');
		
	}
	
	@Test
	public void testShipSize() throws Exception{
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (op.map [i][j] == 'X') counter++;
				
			}
		}
		assertEquals(t, counter);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCrash() throws Exception{
		Schiffe crash1 = new Schiffe (1, 1, "droite", 2);
		Schiffe crash2 = new Schiffe (1, 1, "bas", 2);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalid () throws Exception{
		
		Schiffe shipSizePlus = new Schiffe ( 11, 'Y');
		Schiffe shipSizeMinus = new Schiffe ( -1, 'Y');
		
	}

}
