package com.example.employee.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee")
public class EmployeeModel {

	String firstName;
	String lastName;
	private long dasId;
	private long empNumber;
	String designation;
	String role;
	
	//Constructor using fields
	public EmployeeModel(String firstName, String lastName, long dasId, long empNumber, String designation,
			String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dasId = dasId;
		this.empNumber = empNumber;
		this.designation = designation;
		this.role = role;
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getDasId() {
		return dasId;
	}
	public void setDasId(long dasId) {
		this.dasId = dasId;
	}
	public long getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(long empNumber) {
		this.empNumber = empNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	//toString
	@Override
	public String toString() {
		return "EmployeeModel [firstName=" + firstName + ", lastName=" + lastName + ", dasId=" + dasId + ", empNumber="
				+ empNumber + ", designation=" + designation + ", role=" + role + "]";
	}
	
	
}
