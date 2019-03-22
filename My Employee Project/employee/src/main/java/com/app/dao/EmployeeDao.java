package com.app.dao;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeDao {
	List<Employee> listEmployees();
	String addEmp(Employee e);
	String deleteEmp(Employee e);
	String updateEmp(Employee e);
	Employee getEmployeeDetails(int id);
}
