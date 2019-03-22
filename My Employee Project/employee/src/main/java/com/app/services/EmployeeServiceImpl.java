package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;

@Service("employee_service_dao")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		System.out.println("In Service of list employees");
		return dao.listEmployees();
	}

	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.addEmp(e);
	}

	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee e = dao.getEmployeeDetails(id);
		return dao.deleteEmp(e);
	}

	public String updateEmployee(Employee e) {
		// TODO Auto-generated method stub

		return dao.updateEmp(e);
	}

	public Employee getEmployeeDetails(int id) {
		// TODO Auto-generated method stub
		System.out.println("In servie of emp details " + id);
		return dao.getEmployeeDetails(id);
	}

}
