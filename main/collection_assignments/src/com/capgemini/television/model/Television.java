package com.capgemini.television.model;

public class Television {

	private String company;
	private String teletype;
	private boolean enabled_3D;
	private double price;

	public Television() {
		super();

	}

	public Television(String company, String teletype, boolean enabled_3d, double price) {
		super();
		this.company = company;
		this.teletype = teletype;
		enabled_3D = enabled_3d;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", teletype=" + teletype + ", enabled_3D=" + enabled_3D + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + (enabled_3D ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((teletype == null) ? 0 : teletype.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (enabled_3D != other.enabled_3D)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (teletype == null) {
			if (other.teletype != null)
				return false;
		} else if (!teletype.equals(other.teletype))
			return false;
		return true;
	}

}
