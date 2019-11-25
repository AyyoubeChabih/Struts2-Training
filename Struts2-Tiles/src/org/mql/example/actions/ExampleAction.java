package org.mql.example.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ExampleAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public ExampleAction() {
	}
	
	public String page1() {
		return "page1";
	}

	public String page2() {
		return "page2";
	}
}




