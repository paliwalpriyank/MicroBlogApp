package com.Interceptor;

import com.actionclasses.ActionContext;
import com.actionclasses.LoginActionBean;

import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;

@Intercepts(LifecycleStage.ActionBeanResolution)
public class LoginInterceptor implements Interceptor {
public Resolution intercept(ExecutionContext ec){
	Resolution resolution=null;
	try{
		resolution=ec.proceed();
		ActionContext ac=(ActionContext) (ec.getActionBeanContext());
		if(ac.getUser()==null && ec.getActionBean()!=null){
			if(!ec.getActionBean().getClass().getName().equalsIgnoreCase("com.actionclasses.LoginActionBean")){
				
				return new RedirectResolution(LoginActionBean.class);
			}
		}
			
	}catch(Exception e){
		e.printStackTrace();
	}
	return resolution;	
}
}
