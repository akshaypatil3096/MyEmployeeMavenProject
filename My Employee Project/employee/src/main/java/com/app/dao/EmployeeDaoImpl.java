package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;

	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		System.out.println("In List Employee");
		String jpql = "Select e from Employee e";
		return sf.getCurrentSession().createQuery(jpql, Employee.class).getResultList();
	}

	public String addEmp(Employee e) {
		System.out.println(e);
		Session currentSession= sf.getCurrentSession();
		
		currentSession.save(e);

		// TODO Auto-generated method stub
		
		return "Employee added with empId" + e.getId();
	}


	public Employee getEmployeeDetails(int id) {
		// TODO Auto-generated method stub
		System.out.println("In dao of emp details " + id);
		return sf.getCurrentSession().get(Employee.class, id);
		
	}

	public String deleteEmp(Employee e) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(e);
		return "Employee deleted with empId " + e.getId();
	}

	public String updateEmp(Employee e) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(e);
		return "Employee updated with empId " + e.getId();
	}

}
