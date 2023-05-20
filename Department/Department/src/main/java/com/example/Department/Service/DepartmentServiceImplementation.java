package com.example.Department.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Department.Dao.DepartmentRepository;
import com.example.Department.Model.Department;

@Service
public class DepartmentServiceImplementation implements DepartmentService
{
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public void saveDepartment(Department dp) 
	{
		departmentRepository.save(dp); //save=predefined method
	}

	public List<Department> fetchAllDepartments(int d_id) 
	{
		return departmentRepository.fetchAlldepartments(d_id);
	}
	
	public List<Department> findBylocation(String locationName) 
	{
		// TODO Auto-generated method stub
		return departmentRepository.findByLocation(locationName);
	}

	public List<Department> findByName(String name) 
	{
		// TODO Auto-generated method stub
		return departmentRepository.findByName(name);
	}
	
	public List<Integer> findAllById() 
	{
		// TODO Auto-generated method stub
		return departmentRepository.findAllId();
	}

	
	
}