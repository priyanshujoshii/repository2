package com.labassignment.stafflab.models;

import jakarta.validation.constraints.*;

public class EmployeeDto {
	
	@NotEmpty(message="The name is required")
	private String name;
	
	@NotEmpty(message="The designation is required")
	private String designation;
	
	@NotEmpty(message="The role is required")
	private String job_role;
	
	@Min(0)
	private double salary;
	
	@Size(min = 10, message = "The description should be at least 10 characters")
	@Size(max = 2000, message = "The description cannot exceed 2000 characters")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
