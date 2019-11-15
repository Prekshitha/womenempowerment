package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.UserDao;
import com.model.Register;

@Service("userService")
public class MyServiceImpl implements MyServiceIntf  {
	
	@Autowired
	UserDao userDao;
	

	public List<Register> getUsers() {
		List<Register> list=userDao.getUsers();
		return list;
	}

}
