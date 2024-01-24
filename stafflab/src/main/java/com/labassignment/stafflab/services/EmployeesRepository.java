package com.labassignment.stafflab.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labassignment.stafflab.models.Employee;

public interface EmployeesRepository extends JpaRepository<Employee, Integer>{

	//Don't need to implement this interface because spring JPA will implement this for us
	
	//we can use this interface to read and write the employees from the database
}
