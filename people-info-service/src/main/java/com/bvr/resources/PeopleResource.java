package com.bvr.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bvr.model.Person;
import com.bvr.model.PersonInfo;

@RestController
@RequestMapping("/people")
public class PeopleResource {

	public PeopleResource() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	@RequestMapping("{personId}")
	public Person getPerson(@PathVariable("personId")String personId) {
		//https://api.themoviedb.org/3/person/{person_id}?api_key=<<api_key>>&language=en-US
		String url = "https://api.themoviedb.org/3/person/"+personId+"?api_key="+apiKey+"&language=en-US";
	    PersonInfo perInfo = restTemplate.getForObject(url, PersonInfo.class);
	    Person person = new Person();
	    person.setPersonId(perInfo.getId());
	    person.setDateOfBirth(perInfo.getBirthday());
	    person.setDateOfDeath(perInfo.getDeathday());
	    person.setPersonName(perInfo.getName());
	    person.setGenderOfPerson(perInfo.getGender());
	    
	    return person;
	}

}
