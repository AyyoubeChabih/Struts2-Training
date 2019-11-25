package org.mql.struts.web.interceptors;

import java.lang.reflect.Method;

import org.mql.struts.business.CompanyService;
import org.mql.struts.business.CompanyServiceDefault;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BusinessInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID = 1L;
	private CompanyService service;
	
	public void init() {
		service = new CompanyServiceDefault();
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		// CompanyAction action = (CompanyAction)invocation.getAction(); mauvais
		Object action = invocation.getAction();
		Method m = action.getClass().getDeclaredMethod("setService", CompanyService.class);
		if (m != null) {
			m.invoke(action, service);
		}
		return invocation.invoke();
	}

}
