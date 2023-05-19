package com.example.Example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee 
{
//	        create table emp(
//			emp_id int NOT NULL auto_increment,
//			emp_name varchar(50) default null,
//			emp_salary  float default null,
//			emp_age int default null,
//			emp_city varchar(50) default null,
//			primary key(emp_id));
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_id;
	
	@Column(name="emp_name")
	private String emp_name;
	
	@Column(name="emp_salary")
	private String emp_salary;
	
	@Column(name="emp_age")
	private int emp_age;
	
	@Column(name="emp_city")
	private String emp_city;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public Employee(long emp_id, String emp_name, String emp_salary, int emp_age, String emp_city) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_age = emp_age;
		this.emp_city = emp_city;
	}
	
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_age="
				+ emp_age + ", emp_city=" + emp_city + "]";
	}
	
	
	
}
