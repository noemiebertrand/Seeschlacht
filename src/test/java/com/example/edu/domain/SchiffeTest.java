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
		Schiffe crash1 = new Schiffe (0, 0, "bas", 1);
		Schiffe crash2 = new Schiffe (0, 0, "bas", 2);
		op.printMap();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalid () throws Exception{
		
		Schiffe versuchZuGross = new Schiffe ( 11, 'Y');
		Schiffe versuchZuKlein = new Schiffe ( -1, 'Y');
		
		//genre si map n'est pas remplie d'* alors erreur "IllegalArgumentException"
		//si bateau dépasse de la map alors erreur "IllegalArgumentException"
		
	}

}
