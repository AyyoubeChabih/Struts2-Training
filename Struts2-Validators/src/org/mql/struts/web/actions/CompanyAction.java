package org.mql.struts.web.actions;

import org.mql.struts.models.Company;

import com.opensymphony.xwork2.ActionSupport;

public class CompanyAction extends ActionSupport {
	private Company company;
	private String message;
	
	private static final long serialVersionUID = 1L;
	
	public CompanyAction() {
		company = new Company();
	} 
	
	public String addCompany() {
		message = "Entreprise bien enregistée!";
		return "ok";
	}
	
	// Getters & Setters
	
	public void validate() {
		if (company.getName() == null || company.getName().trim().equals("")) {
			addFieldError("name","Le nom de l'entreprise est obligatoire !");
		}
		  
		if (company.getId() <= 0) {
			addFieldError("id","L'identificateur doit étre un entier supérieur à 0");
		}
	}	
	
	public Company getCompany() {
		System.out.println(">> getCompany()");
		return company;
	}
	
	public String getMessage() {
		return message;
	}

	public int getId() {
		return company.getId();
	}

	public String getName() {
		return company.getName();
	}

	public void setId(int id) {
		company.setId(id);
	}

	public void setName(String name) {
		company.setName(name);
	}

	public String getCity() {
		return company.getCity();
	}

	public void setCity(String city) {
		company.setCity(city);
	}
	
}
