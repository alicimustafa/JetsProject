package com.mustafa.jets;

public class Pilot {
	private String name;
	private int age;
	private int fligthExperiance;

	public Pilot(String name, int age, int fligthExperiance) {
		super();
		this.name = name;
		this.age = age;
		this.fligthExperiance = fligthExperiance;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getFligthExperiance() {
		return fligthExperiance;
	}
	
	public void addExperience(int e) {
		if(e >= 0) {
			fligthExperiance += e;
		}
	}
	
	public void addAge(int a) {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", fligthExperiance=");
		builder.append(fligthExperiance);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + fligthExperiance;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Pilot other = (Pilot) obj;
		if (age != other.age)
			return false;
		if (fligthExperiance != other.fligthExperiance)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
