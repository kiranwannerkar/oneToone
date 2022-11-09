package com.onetoonebi.dto;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.OneToOne;

	@Entity
	public class Person {

		@Id
		private int id;
		private String name;
		private int age;
		private long phone;

		@OneToOne(mappedBy = "person")
		private Adhar adhar;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		public Adhar getAdhar() {
			return adhar;
		}

		public void setAdhar(Adhar adhar) {
			this.adhar = adhar;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", adhar=" + adhar + "]";
		}
		

	}
	
	

