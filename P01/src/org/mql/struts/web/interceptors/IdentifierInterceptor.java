package org.mql.struts.web.interceptors;

import java.util.Vector;

import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class IdentifierInterceptor extends AbstractInterceptor {
	private String identifierName = "id";
	private Vector<Integer> identifiers;

	public void init() {
		identifiers = new Vector<Integer>();
	}
	
	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	
	public String intercept(ActionInvocation invocation) throws Exception {
		Parameter param =  invocation.getInvocationContext().getParameters().get(identifierName);
		if (param.getValue() != null) {
			try {
				int id = Integer.parseInt(param.getValue());
				if (identifiers.contains(id)) {
					invocation.getInvocationContext().put("message", "L'identificateur déjà utilisé");
					return "error";					
				} else {
					identifiers.add(id);
				}
			} catch (Exception e) {
				invocation.getInvocationContext().put("message", "Le paramètre [" + identifierName + "] doit étre un entier");
				return "error";
			}
		}
		return invocation.invoke();
	}

}
