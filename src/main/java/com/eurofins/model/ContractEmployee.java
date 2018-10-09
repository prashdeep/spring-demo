package com.eurofins.model;

public class ContractEmployee extends Employee {

	private double payPerHour;
	private int durationInDays;

	public ContractEmployee(long id, String name) {
		super(id, name);
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", durationInDays=" + durationInDays + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + durationInDays;
		long temp;
		temp = Double.doubleToLongBits(payPerHour);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractEmployee other = (ContractEmployee) obj;
		if (durationInDays != other.durationInDays)
			return false;
		if (Double.doubleToLongBits(payPerHour) != Double.doubleToLongBits(other.payPerHour))
			return false;
		return true;
	}

}
