package com.jpa.test.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.Dao.UserRepository;
import com.jpa.test.Model.UserRecord;

@Service 													// used with classes that provide some business functionalities
public class UserServiceImplementation implements UserService
{
	@Autowired 
	UserRepository u;
	
	@Override
	public void Save(UserRecord ur)
	{
		u.save(ur);
	}

	public List<UserRecord> FetchData() 
	{
		// TODO Auto-generated method stub
		return u.findAll();
	}

}
