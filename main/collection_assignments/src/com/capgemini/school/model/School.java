package com.capgemini.school.model;

public class School {

	private String name;
	private String city;
	private String cityDistrict;
	private int greatSchoolRanking;

	public School() {
		super();

	}

	public School(String name, String city, String cityDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.cityDistrict = cityDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", cityDistrict=" + cityDistrict + ", greatSchoolRanking="
				+ greatSchoolRanking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((cityDistrict == null) ? 0 : cityDistrict.hashCode());
		result = prime * result + greatSchoolRanking;
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (cityDistrict == null) {
			if (other.cityDistrict != null)
				return false;
		} else if (!cityDistrict.equals(other.cityDistrict))
			return false;
		if (greatSchoolRanking != other.greatSchoolRanking)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
