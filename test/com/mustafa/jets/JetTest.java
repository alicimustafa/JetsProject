package com.mustafa.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetTest {
	
	private Jet j;
	
	@Before
	public void setUp() throws Exception {
		Pilot p = new Pilot("james", 23, 1000);
		j = new Jet("jcc", 300_000.00, 780.00, 900, p	);
	}

	@After
	public void tearDown() throws Exception {
		j = null;
	}

	@Test
	public void test_convertToMach_returns_double() {
		double value = j.convertToMach();
		int conv = (int)value;
		assertFalse(value == conv);
	}
	@Test
	public void test_convertToMach_returns_correct_value() {
		assertEquals(1.01659, j.convertToMach(), 0.00001);
	}

}
