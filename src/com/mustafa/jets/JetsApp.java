package com.mustafa.jets;

public class JetsApp {

	public static void main(String[] args) {
		startAirport();

	}
	
	public static void startAirport() {
		Pilot[] pilotList = {
				new Pilot("James", 36, 360),
				new Pilot("Robert", 27, 200),
				new Pilot("Stacy", 39, 400),
				new Pilot("Pam", 25, 120),
				new Pilot("Kirk", 47, 600),
				new Pilot("Lisa", 56, 700),
				new Pilot("Hammil", 45, 460),
				new Pilot("Kerry", 38, 357),
				new Pilot("Samantha", 30, 290),
				new Pilot("Will", 57, 1000)
			};
		PilotLounge myLounge = new PilotLounge(pilotList);
		Jet[] jetList = {
				new Jet("Airbuss 330", 300_000, 541, 8357, myLounge.getFreePilot()),
				new Jet("Boeing 777", 700_000, 590, 7800, myLounge.getFreePilot()),
				new Jet("Boeing 747", 500_000, 614, 6087, myLounge.getFreePilot()),
				new Jet("L-1011", 500_000, 605, 4404, myLounge.getFreePilot()),
				new Jet("Boeing 747", 500_000, 614, 6087, myLounge.getFreePilot())
		};
		JetHanger myHanger = new JetHanger(jetList);
		Airport myAirport = new Airport(myHanger, myLounge);
		AirportManager myManager = new AirportManager(myAirport);
		myManager.start();
	}	

}
