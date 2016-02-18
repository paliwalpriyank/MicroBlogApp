package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoOperations;

import com.Documents.Person;

import net.sourceforge.stripes.action.DefaultHandler;

public class PostDaoImpl {
	@Autowired
	MongoOperations mo;
	
	public void save(){
		
		Person p=new Person();
		p.setName("Priyank");
		mo.insert(p);
		System.out.print("Inserted");
		
	}

}
