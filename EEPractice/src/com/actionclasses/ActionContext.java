package com.actionclasses;

import com.model.User;

import net.sourceforge.stripes.action.ActionBeanContext;


public class ActionContext extends ActionBeanContext {
	
	
	public User getUser(){
		
		return (User) getRequest().getSession().getAttribute("user");
	}
	public void setUser(User currentUser){
		getRequest().getSession().setAttribute("user", currentUser);
	}
	public void logout() {
        getRequest().getSession().invalidate();
    }

}
