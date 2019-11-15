package com.dao;

import com.model.Contact;
import com.model.Register;

public interface MydaoIntf {
	public boolean insertContact(Contact contact);
	public boolean insertRegister(Register register);

}
