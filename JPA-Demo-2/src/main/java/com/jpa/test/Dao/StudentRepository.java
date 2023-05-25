package com.jpa.test.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> 
{
	//JPQL(HQL) and native(SQL) queries
	
	@Query("Select s from StudentModel s where s.first_name=:first_name")
	public List<StudentModel> findByName(String first_name);

	@Query("Select s from StudentModel s where s.rollno=:rollno")
	public List<StudentModel> fetchByid(int rollno);
	
	@Query("Select s.rollno from StudentModel s")
	public List<StudentModel> fetchAllByRollno();
	
	@Query("Select s from StudentModel s")
	public List<StudentModel> getAllName();

	@Query("Select s from StudentModel s where s.city=:city")
	public List<StudentModel> fetchCity(String city);

	@Query("Select s from StudentModel s where s.email=:email")
	public List<StudentModel> fetchEmail(String email);

	
}











































//
//@Query("Select s From StudentModel s")
//public List<StudentModel> getAllStudent();
//

//@Query("Select s From StudentModel s where s.name=:n") 					//parameterized querey (n is parameter which is bind with String name)
//public List<StudentModel> getStudentByName(@Param("n")String name); 	//n is bind with name
//	
//
//@Query("Select s From StudentModel s where s.name=:n and s.city=:c")
//public List<StudentModel> getStudentNameWithCity(@Param("n")String name,@Param("c")String city); 
//
////By using native queries
//@Query(value= "select * from StudentModel",nativeQuery=true)
//public List<StudentModel> getStudents();

//