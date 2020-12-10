package com.example.edu.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class AddditionTest extends TestCase {
	Adddition op;
	static int a;
	int b;
	@Before
	public void setUp() throws Exception {
		op = new Adddition();
		a=0;

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculer() throws Exception {
		assertEquals(new Long(4), 
				op.calculer(new Long(1), new Long(3)));
	}

	@Test
	public void testLireSymbole() throws Exception {
		assertEquals((Character)'-', op.lireSymbole());
	}

	@Test
	public void testCore() throws Exception {
		op.core(op);
		System.out.println(op);
		assertEquals(1.0 , op.getX());
	}

}
