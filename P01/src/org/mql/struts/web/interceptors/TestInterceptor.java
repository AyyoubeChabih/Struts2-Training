package org.mql.struts.web.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TestInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	public TestInterceptor() {
		System.out.println(">> new TestInterceptor()");
	}
	
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println(">> TestInterceptor.intercept");
		return invocation.invoke();
	}

}


