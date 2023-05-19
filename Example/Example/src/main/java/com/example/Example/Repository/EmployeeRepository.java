package com.example.Example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Example.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,Long> 
{

}
