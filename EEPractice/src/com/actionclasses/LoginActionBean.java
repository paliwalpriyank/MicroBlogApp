package com.actionclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.LoginDaoImpl;
import com.model.User;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;

@Component
@UrlBinding("/Login.action")
public class LoginActionBean extends ActionBeanBase {
	@ValidateNestedProperties({		
		@Validate(field="username", required=true),
		@Validate(field="password", required=true)
	})
	private User user=new User();
	
	
	public LoginDaoImpl getLoginDaoImpl() {
		return loginDaoImpl;
	}
	
	
	@SpringBean	
	public void setLoginDaoImpl(LoginDaoImpl loginDaoImpl) {
		this.loginDaoImpl = loginDaoImpl;
		System.out.print("Login Dao set");
	}
	
	
	public LoginDaoImpl loginDaoImpl;
	
			
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	@DefaultHandler
	@DontValidate
	public Resolution myLogin(){		
		return new ForwardResolution("/login.jsp");
	}
	
	public Resolution checkLogin(){
		
		user=loginDaoImpl.login(user.getUsername(), user.getPassword());
		if(user.getUsername()!=null)
		return new ForwardResolution("loginsuccess.jsp");
		getContext().setUser(user);
		return new ForwardResolution("login.jsp");
	}
	
}
