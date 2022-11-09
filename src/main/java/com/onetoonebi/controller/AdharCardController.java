package com.onetoonebi.controller;

import com.onetoonebi.dao.AdharCardDao;
import com.onetoonebi.dto.Adhar;
import com.onetoonebi.dto.Person;

public class AdharCardController {
		public static void main(String[] args) {

			Person person = new Person();
			person.setId(1);
			person.setName("Sopan");
			person.setAge(26);
			person.setPhone(84647);
	
			Adhar adhar = new Adhar();
			adhar.setId(101);
			adhar.setName("karan");
			adhar.setAdharNo("88003524");
	
			adhar.setPerson(person);
			person.setAdhar(adhar);

			AdharCardDao adharDAO = new AdharCardDao();
			adharDAO.save(person);
//			Adhar adhar1= adharDAO.getDetail(1);
//			System.out.println(adhar1);
		}

	}


