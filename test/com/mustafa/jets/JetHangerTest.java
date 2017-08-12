package com.mustafa.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetHangerTest {
	
	JetHanger jh;

	@Before
	public void setUp() throws Exception {
		Pilot p = new Pilot("jj", 18, 200);
		Jet[] jArray = {
				new Jet("aa", 300.00, 700.00, 1000, p),
				new Jet("bb", 300.00, 600.00, 1100, p),
				new Jet("cc", 300.00, 1000.00, 900, p)
		};
		jh = new JetHanger(jArray);
	}

	@After
	public void tearDown() throws Exception {
		jh = null;
	}

	@Test
	public void test_addJet_to_see_if_jet_added() {
		Jet j = new Jet("dd", 300.00, 300, 300, null);
		int length = jh.getJetList().length;
		jh.addJet(j);
		assertTrue(jh.getJetList().length == length + 1);
	}
	
	@Test 
	public void test_getFastest_to__see_if_returns_fastest_jet() {
		assertTrue(jh.getJetList()[2].equals(jh.getFastest()));
	}
	
	@Test
	public void test_getFastest_does_not_return_null() {
		assertNotNull(jh.getFastest());
	}
	
	@Test
	public void test_getFastest_returns_a_Jet() {
		assertTrue(jh.getFastest() instanceof Jet);
	}
	
	@Test
	public void test_getLongesRange_does_not_return_null() {
		assertNotNull(jh.getLongesRange());
	}
	
	@Test
	public void test_getLongesRange_returns_a_jet() {
		assertTrue(jh.getLongesRange() instanceof Jet);
	}
	
	@Test  
	public void test_getLongesRange_returns_longes_range_jet() {
		assertTrue(jh.getJetList()[1].equals(jh.getLongesRange()));
	}

}
