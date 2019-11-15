package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MydaoIntf;
import com.model.Contact;
import com.model.Register;

@Service("myService")
public class MyServiceImpl implements MyServiceIntf {

	@Autowired
	MydaoIntf myDao;
	public boolean insertContact(Contact contact) {
		boolean flag=myDao.insertContact(contact);
		System.out.println("service is called");
		return flag;
	}
	public boolean insertRegister(Register reg) {
		// TODO Auto-generated method stub
		boolean flag=myDao.insertRegister(reg);
		System.out.println("service is called");
		return flag;
	}
	
	

}
