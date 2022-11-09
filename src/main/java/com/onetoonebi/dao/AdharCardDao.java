package com.onetoonebi.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onetoonebi.dto.Adhar;
import com.onetoonebi.dto.Person;

public class AdharCardDao {

	public void save (Person person)
	{
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Adhar adhar = person.getAdhar();
		entityTransaction.begin();
		entityManager.persist(adhar);
		entityManager.persist(person);

		entityTransaction.commit();
	}

	public Adhar getDetail(int id)
	{
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Adhar adhar = entityManager.find(Adhar.class, id);
		return adhar;
	}

}

