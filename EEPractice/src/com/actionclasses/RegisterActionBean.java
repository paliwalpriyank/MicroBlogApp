package com.actionclasses;

import com.model.User;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.validation.LocalizableError;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;

@UrlBinding("/Register.action")
public class RegisterActionBean extends ActionBeanBase{
	@ValidateNestedProperties({
		@Validate(field="firstName", required=true),
		@Validate(field="lastName", required=true),
		@Validate(field="username", required=true),
		@Validate(field="password", required=true)
	})
	private User user;
	
	@Validate(required=true)
	private String confirmPassword;
			
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@ValidationMethod
	public void validateRegister(ValidationErrors ve){
		if(!user.getPassword().equals(confirmPassword)){
			ve.add("user.password",new LocalizableError("ConfirmNMatch"));
		}
	}
	
	@DefaultHandler
	@DontValidate
	public Resolution register(){
		return new ForwardResolution("register.jsp");
	}
	
	public Resolution registerUser(){
		return new ForwardResolution(LoginActionBean.class);
	}
}
