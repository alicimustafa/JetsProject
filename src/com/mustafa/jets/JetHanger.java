package com.mustafa.jets;

import java.util.Arrays;

public class JetHanger {
	
	private Jet[] jetList;
	
	public JetHanger() {
		// TODO Auto-generated constructor stub
	}

	public Jet[] getJetList() {
		return jetList;
	}

	public void addJet(Jet newJet) {
		
	}

	public Jet getFastest() {
		
		return null;
	}
	
	public Jet getLongesRange() {
		
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JetHangar [jetList=");
		builder.append(Arrays.toString(jetList));
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(jetList);
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
		JetHanger other = (JetHanger) obj;
		if (!Arrays.equals(jetList, other.jetList))
			return false;
		return true;
	}
	
	
}
