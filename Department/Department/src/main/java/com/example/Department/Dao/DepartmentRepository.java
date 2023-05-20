package com.example.Department.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Department.Model.Department;

import jakarta.transaction.Transactional;

public interface DepartmentRepository extends JpaRepository<Department,Integer> //ctrl+space(pojo class name)
{
//	@Modifying
//	@Transactional
//	@Query("Insert into Department values(?1,?2)")
//	void saveCustom(String departmentName, String departmentLocation);

	/*****************************   JPA Queries ***********************************/
	
	
	
	@Query("Select t from Department t where t.id=:id")
	List<Department> fetchAlldepartments(int id);	

	public List<Department> findByLocation(String locationName);

	public List<Department> findByName(String name);
	@Query("Select t.id from Department t")
	public List<Integer> findAllId();



	
}
