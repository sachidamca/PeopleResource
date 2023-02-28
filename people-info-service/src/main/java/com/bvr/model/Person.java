package com.bvr.model;

public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer personId;
	private String personName;
	private Integer genderOfPerson;
	private String dateOfBirth;
	private String dateOfDeath;
	
	public Person(Integer personId, String personName, Integer genderOfPerson, String dateOfBirth, String dateOfDeath) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.genderOfPerson = genderOfPerson;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getGenderOfPerson() {
		return genderOfPerson;
	}

	public void setGenderOfPerson(Integer genderOfPerson) {
		this.genderOfPerson = genderOfPerson;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}
	
	
}
