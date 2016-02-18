package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
@Configuration
public class MongoConfig {
	 public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		    
		    return new SimpleMongoDbFactory(new Mongo(), "blog");
		  }

		  public @Bean MongoTemplate mongoTemplate() throws Exception {
		    return new MongoTemplate(mongoDbFactory());
		  }
}
