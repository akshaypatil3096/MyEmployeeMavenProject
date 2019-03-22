package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "employeeData")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String name, desig, sal;

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("In pojo of employee");
	}

	public Employee(int id, String name, String desig, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + ", sal=" + sal + "]";
	}

}
