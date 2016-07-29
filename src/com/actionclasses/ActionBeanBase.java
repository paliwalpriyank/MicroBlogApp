package com.actionclasses;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public abstract class ActionBeanBase implements ActionBean{
	private ActionContext ctx;
	
	public ActionContext getContext() {		
		return ctx;
	}	
	
	public void setContext(ActionBeanContext arg0) {
		this.ctx=(ActionContext)arg0;		
	}
}
