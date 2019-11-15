package com.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.model.Contact;
import com.model.Register;


@Repository("myDao")
public class MydaoImpl implements MydaoIntf {

	public boolean insertContact(Contact contact) {
		// give the hibernate or jpa
		System.out.println("dao called");
		return true;
	}

	public boolean insertRegister(Register reg){
		Boolean result=false;
		try{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
			EntityManager em1=emf.createEntityManager();
			em1.getTransaction().begin();
			em1.persist(reg);
			em1.getTransaction().commit();
            result=true;
            em1.close();
            emf.close();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return result;
	}

}
