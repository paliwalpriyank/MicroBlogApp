package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.catalina.core.ApplicationContext;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.model.User;
import com.springsource.tcserver.serviceability.request.DataSource;

@Component
public class LoginDaoImpl {
	@Autowired
	BasicDataSource dataSource;
	
	public LoginDaoImpl(){
		System.out.println("In login dao constructor");
	}
	
	
	//BasicDataSource dataSource;
	
	public User login(String username, String password){
		//org.springframework.context.ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//BasicDataSource dataSource= (BasicDataSource) ctx.getBean("dataSource");
		
		Connection conn=null;
		User user=null;
		try{
		conn=dataSource.getConnection();
		PreparedStatement ps=conn.prepareStatement("Select * from user where username=?");
		ps.setString(1, username);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next())
		{
			if(rs.getString("password").equals(password)){
				user=new User();
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setUsername(rs.getString("username"));
			}
		}		
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return user;
	}
}
