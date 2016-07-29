package com.dao;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

import com.Documents.Person;
import com.mongodb.Mongo;
import com.repository.MongoDbCustomerRepository;

import net.sourceforge.stripes.action.DefaultHandler;
@Component
public class PostDaoImpl {
	//@Autowired
	//MongoOperations mongoOps;
	//@Autowired
	//private MongoDbCustomerRepository mog;
	
	public void save(){
		Person p= new Person();
		p.setEmail("paliwal.priyank@gmail.com");
		p.setName("Priyank");
		//MongoDbCustomerRepository md= new MongoDbCustomerRepository(mo);
		//mo.save(p);
		
		MongoOperations mongoOps;
		try {
			mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(), "blog"));
		//mog.save(p);
			mongoOps.insert(p);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	Person p=new Person();
		p.setName("Priyank");
		mo.insert(p);
		System.out.print("Inserted");*/
		
	}

}
