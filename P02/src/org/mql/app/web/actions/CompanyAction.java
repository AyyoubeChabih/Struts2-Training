package org.mql.app.web.actions;

import org.apache.struts2.convention.annotation.Action; // c'est n'est plus une classe POJO
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.mql.app.models.Company;

import com.opensymphony.xwork2.ModelDriven;

//@ParentPackage("config") par default c'est struts-default
//@ResultPath("/WEB-INF/views") pour changer le repertoire des vues
public class CompanyAction implements ModelDriven<Company> { // ModelDriven appel getCompany et appel les setters de ce model
	private Company company;
	
	public CompanyAction() {
		System.out.println(">> new CompanyAction()");
		company = new Company();
	}
	
	public String execute() {
		System.out.println(">> CompanyAction.execute()");
		return "ok";
	}
	
	@Action("/addCompany")
	public String addCompany() {
		System.out.println(">> CompanyAction.addCompany()");
		return "ok";
	}
	
	@Action(
		value="/companyList",
		results = {
			@Result(name = "ok", location = "/views/CompanyList.jsp"),
			@Result(name = "error", location = "/views/Error.jsp")
		}
	)
	public String companyList() {
		System.out.println(">> CompanyAction.companyList()");
		return "ok";
	}

	public Company getModel() {
		return company;
	}
	
	
}
