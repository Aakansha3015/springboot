package com.jpa.test.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.test.Model.UserRecord;

public interface UserRepository extends JpaRepository<UserRecord,Integer>          //(Classname,primary key datatype)
{
			//JPA queries :Custom 
}
