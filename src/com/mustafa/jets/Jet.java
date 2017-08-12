package com.mustafa.jets;

public class Jet {

	static int id = 1000;

	private String model;
	private double price;
	private double speed;
	private int range;
	private int planeId;
	private Pilot currentPilot;
	
	
	public Jet(String model) {
		super();
		id++;
		this.model = model;
		this.planeId = id;
	}


	public Jet(String model, double price, double speed, int range, Pilot currentPilot) {
		super();
		id++;
		this.model = model;
		this.price = price;
		this.speed = speed;
		this.range = range;
		this.planeId = id;
		this.currentPilot = currentPilot;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public Pilot getCurrentPilot() {
		return currentPilot;
	}


	public void setCurrentPilot(Pilot currentPilot) {
		this.currentPilot = currentPilot;
	}


	public String getModel() {
		return model;
	}


	public int getPlaneId() {
		return planeId;
	}

	public double convertToMach() {
		return 0.0;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model=");
		builder.append(model);
		builder.append(", price=");
		builder.append(price);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", planeId=");
		builder.append(planeId);
		builder.append(", currentPilot=");
		builder.append(currentPilot);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentPilot == null) ? 0 : currentPilot.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + planeId;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + range;
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Jet other = (Jet) obj;
		if (currentPilot == null) {
			if (other.currentPilot != null)
				return false;
		} else if (!currentPilot.equals(other.currentPilot))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (planeId != other.planeId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (range != other.range)
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		return true;
	}
	

}
