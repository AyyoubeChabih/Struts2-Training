package org.mql.struts.business;

public class BussinessFactory {
	private static CompanyService service;
	
	static {
		service = new CompanyServiceDefault();
	}
	
	public static CompanyService getService() {
		return service;
	}
}
