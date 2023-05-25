package com.jpa.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollno;
	String first_name;
	String last_name;
	double percentage;
	String city;
	Long phone_no;
	String email;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StudentModel(int rollno, String first_name, String last_name, double percentage, String city, Long phone_no,
			String email) {
		super();
		this.rollno = rollno;
		this.first_name = first_name;
		this.last_name = last_name;
		this.percentage = percentage;
		this.city = city;
		this.phone_no = phone_no;
		this.email = email;
	}
	public StudentModel() {
		super();
	}
	@Override
	public String toString() {
		return "StudentModel [rollno=" + rollno + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", percentage=" + percentage + ", city=" + city + ", phone_no=" + phone_no + ", email=" + email + "]";
	}
	
	
	
}
	
	
	

