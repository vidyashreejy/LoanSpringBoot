package com.kuwy.beans;

public class RegistrationReply {
	String vehicle;
	String vehicle_type;
	String loan_type;
	String brand;
	String location;
	String Condition;
	
	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCondition() {
		return Condition;
	}

	public void setCondition(String condition) {
		Condition = condition;
	}

	String registrationNumber;
	String registrationStatus;

	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */
	public String getRegistrationNumber() {
	return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
	this.registrationNumber = registrationNumber;
	}

	public String getRegistrationStatus() {
	return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
	this.registrationStatus = registrationStatus;
	}

}
