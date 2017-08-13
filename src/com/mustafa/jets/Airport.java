package com.mustafa.jets;

public class Airport {
	private JetHanger myHanger;
	private PilotLounge mylounge;
	
	public Airport() {
		// TODO Auto-generated constructor stub
	}
	
	public JetHanger getMyAirport() {
		return myHanger;
	}

	public PilotLounge getMylounge() {
		return mylounge;
	}

	public void initilizePilotLounge() {
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
		mylounge = new PilotLounge(pilotList);
	}
	
	public void initilizeJetHanger() {
		Jet[] jetList = {
				new Jet("Airbuss 330", 300_000, 541, 8357, mylounge.getFreePilot()),
				new Jet("Boeing 777", 700_000, 590, 7800, mylounge.getFreePilot()),
				new Jet("Boeing 747", 500_000, 614, 6087, mylounge.getFreePilot()),
				new Jet("L-1011", 500_000, 605, 4404, mylounge.getFreePilot()),
				new Jet("Boeing 747", 500_000, 614, 6087, mylounge.getFreePilot())
		};
		myHanger = new JetHanger(jetList);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Airport [myHanger=");
		builder.append(myHanger);
		builder.append(", mylounge=");
		builder.append(mylounge);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myHanger == null) ? 0 : myHanger.hashCode());
		result = prime * result + ((mylounge == null) ? 0 : mylounge.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (myHanger == null) {
			if (other.myHanger != null)
				return false;
		} else if (!myHanger.equals(other.myHanger))
			return false;
		if (mylounge == null) {
			if (other.mylounge != null)
				return false;
		} else if (!mylounge.equals(other.mylounge))
			return false;
		return true;
	}
	
	
}
