package com.eurofins.model;

public class RegularEmployee extends Employee{

	private double salary;
	private int vacationDays;
	
	public RegularEmployee(long id, String name) {
		super(id, name);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", vacationDays=" + vacationDays + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + vacationDays;
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
		RegularEmployee other = (RegularEmployee) obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (vacationDays != other.vacationDays)
			return false;
		return true;
	}
	
	

}
