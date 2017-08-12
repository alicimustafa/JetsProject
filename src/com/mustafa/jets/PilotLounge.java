package com.mustafa.jets;

import java.util.Arrays;

public class PilotLounge {
	private Pilot[] pilotList;
	private Pilot[] freePilots;
	
	public PilotLounge() {
		// TODO Auto-generated constructor stub
	}

	public Pilot[] getPilotList() {
		return pilotList;
	}

	public Pilot[] getFreePilots() {
		return freePilots;
	}
	
	public void addPilot(Pilot p) {
		
	}
	
	public Pilot getFreePilot() {
		
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PilotLounge [pilotList=");
		builder.append(Arrays.toString(pilotList));
		builder.append(", freePilots=");
		builder.append(Arrays.toString(freePilots));
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(freePilots);
		result = prime * result + Arrays.hashCode(pilotList);
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
		PilotLounge other = (PilotLounge) obj;
		if (!Arrays.equals(freePilots, other.freePilots))
			return false;
		if (!Arrays.equals(pilotList, other.pilotList))
			return false;
		return true;
	}
	
	
}
