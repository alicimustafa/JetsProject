package com.mustafa.jets;

public class Airport {
	private JetHanger myHanger;
	private PilotLounge myLounge;
	
	public Airport(JetHanger myHanger, PilotLounge myLounge) {
		super();
		this.myHanger = myHanger;
		this.myLounge = myLounge;
	}

	public JetHanger getMyHanger() {
		return myHanger;
	}

	public PilotLounge getMylounge() {
		return myLounge;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Airport [myHanger=");
		builder.append(myHanger);
		builder.append(", mylounge=");
		builder.append(myLounge);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myHanger == null) ? 0 : myHanger.hashCode());
		result = prime * result + ((myLounge == null) ? 0 : myLounge.hashCode());
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
		if (myLounge == null) {
			if (other.myLounge != null)
				return false;
		} else if (!myLounge.equals(other.myLounge))
			return false;
		return true;
	}
	
	
}
