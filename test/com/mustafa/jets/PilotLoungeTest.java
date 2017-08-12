package com.mustafa.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PilotLoungeTest {
	
	PilotLounge pl;

	@Before
	public void setUp() throws Exception {
		Pilot[] pilotArr = { new Pilot("jj", 19, 200)};
		pl = new PilotLounge(pilotArr);
	}
		 

	@After
	public void tearDown() throws Exception {
		pl = null;
	}

	@Test
	public void test_addPilot_adds_new_pilot() {
		int pList = pl.getPilotList().length;
		int fList = pl.getFreePilots().length;
		pl.addPilot(new Pilot("aa", 19, 400));
		assertTrue(pList + 1 == pl.getPilotList().length);
		assertTrue(fList + 1 == pl.getFreePilots().length);
	}
	
	@Test
	public void test_getFreePilot_retruns_a_pilot() {
		assertTrue(pl.getFreePilot() instanceof Pilot);
	}
	
	@Test
	public void test_getFreePilot_removes_pilot_from_freePilots_not_from_pilot_list() {
		int pList = pl.getPilotList().length;
		int fList = pl.getFreePilots().length;
		pl.getFreePilot();
		assertTrue(pList  == pl.getPilotList().length);
		assertTrue(fList - 1 == pl.getFreePilots().length);
	}

}
