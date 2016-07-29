package com.Documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "Person["+"name]";
	}
	
	
}
