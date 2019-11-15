package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.model.Register;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	
	public List<Register> getUsers() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Register> list=em.createQuery("SELECT r FROM Register r").getResultList();
		System.out.println("dao is called");
		return list;
	}

}
