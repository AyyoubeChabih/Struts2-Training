package org.mql.struts.web.actions;

import org.mql.struts.business.BussinessFactory;
import org.mql.struts.business.CompanyService;
import org.mql.struts.models.Company;

public class CompanyAction {
	private Company company;
	private CompanyService service;
	private String message;
	
	public CompanyAction() {
		System.out.println(">> new CompanyAction()");
		company = new Company();
		//service = BussinessFactory.getService();
	}
	
	public void setService(CompanyService service) {
		System.out.println(">> setSerivce() : BusinessInterceptor");
		this.service = service;
	}
	
	public void setId(int id) {
		System.out.println(">> setId()");
		company.setId(id);
	}

	public void setName(String name) {
		System.out.println(">> setName()");
		company.setName(name);
	}

	public void setCity(String city) {
		System.out.println(">> setCity()");
		company.setCity(city);
	}

	public String execute() {
		System.out.println(">> execute()");
		return "success";
	}
	
	public String addCompany() {
		System.out.println(">> addCompany() : " + company);
		boolean result = service.addCompany(company);
		if (result) {
			message = "Entreprise bien enregistée!";
			return "ok";
		}
		else {
			message = "Entreprise [" + company.getId() + "] déjà existante!";
			return "error";
		}
	}
	
	public Company getCompany() {
		System.out.println(">> getCompany()");
		return company;
	}
	
	public String getMessage() {
		return message;
	}
}
