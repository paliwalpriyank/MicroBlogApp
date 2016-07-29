package com.actionclasses;

import com.dao.PostDaoImpl;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/Post.action")
public class PostActionBean extends ActionBeanBase{
	
	private String title;
	
public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

@DefaultHandler
public Resolution createNew(){
	PostDaoImpl pdi=new PostDaoImpl();
	pdi.save();
	return new ForwardResolution("/createPost.jsp");	
}

public Resolution save(){
	return new ForwardResolution("/loginsuccess.jsp");
}

}
