package com.mustafa.jets;

import java.util.Arrays;

public class PilotLounge {
	private Pilot[] pilotList;
	private Pilot[] freePilots;
	
	public PilotLounge() {
		// TODO Auto-generated constructor stub
	}

	public PilotLounge(Pilot[] pilots) {
		super();
		this.pilotList = pilots;
		this.freePilots = pilots;
	}

	public Pilot[] getPilotList() {
		return pilotList;
	}

	public Pilot[] getFreePilots() {
		return freePilots;
	}
	
	public void addPilot(Pilot p) {
		int pilotLitstLength = pilotList.length;
		int freePilotLength = freePilots.length;
		Pilot[] temp = new Pilot[pilotLitstLength+1];
		for(int i=0; i < pilotLitstLength; i++) {
			temp[i] = pilotList[i];
		}
		temp[pilotLitstLength] = p;
		pilotList = temp;
		temp = new Pilot[freePilotLength+1];
		for(int i= 0; i < freePilots.length; i++) {
			temp[i] = freePilots[i];
		}
		temp[freePilotLength] = p;
		freePilots = temp;
	}
	
	public Pilot getFreePilot() {
		int r = (int)(Math.random() * freePilots.length);
		Pilot[] temp = new Pilot[freePilots.length - 1];
		Pilot rPilot = freePilots[r];
		for (int i = 0; i < temp.length; i++) {
			if(i >= r) {
				temp[i] = freePilots[i+1];
			} else {
				temp[i] = freePilots[i];
			}
		}
		freePilots = temp;
		return rPilot;
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
