package com.example.Department.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String location;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public Department(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
