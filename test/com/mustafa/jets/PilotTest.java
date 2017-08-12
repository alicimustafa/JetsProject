package com.mustafa.jets;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mustafa.jets.Pilot;

public class PilotTest {
	
	Pilot p;

	@Before
	public void setUp() throws Exception {
		p = new Pilot("Charles", 34, 1000);
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void test_addExperience_adds_to_experiance() {
		p.addExperience(10);
		assertTrue(p.getFligthExperiance() == 1010);
	}
	
	@Test
	public void test_addExperience_does_not_add_negative_experiance() {
		p.addExperience(-10);
		assertTrue(p.getFligthExperiance() == 1000);
	}
	
	@Test
	public void test_addAge_adds_to_age() {
		p.addAge(4);
		assertTrue(p.getAge() == 38);
	}
	
	@Test
	public void test_addAge_does_not_add_negative_age() {
		p.addAge(-4);
		assertTrue(p.getAge() == 34);
	}
	

}
