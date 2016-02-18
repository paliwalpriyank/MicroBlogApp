package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import static org.springframework.data.mongodb.core.query.Criteria.*;

import com.Documents.Person;

@Repository
@Profile("mongodb")
public class MongoDbCustomerRepository implements CustomerRepository {
	private final MongoOperations operations;

	@Autowired
	public MongoDbCustomerRepository(MongoOperations operations) {
		Assert.notNull(operations);
		this.operations = operations;
	}

	@Override
	public Person findOne(Long id) {
		Query query = new Query(where("id").is(id));
		return operations.findOne(query, Person.class);
	}

	@Override
	public Person save(Person customer) {
		operations.save(customer);
		return customer;
	}

}