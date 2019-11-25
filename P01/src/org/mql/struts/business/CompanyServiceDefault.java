package org.mql.struts.business;

import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.mql.struts.models.Company;

public class CompanyServiceDefault implements CompanyService {
	private Hashtable<Integer, Company> companyList;
	
	public CompanyServiceDefault() {
		companyList = new Hashtable<Integer, Company>();
	}
	
	public boolean addCompany(Company company) {
		if (companyList.get(company.getId()) != null) return false;
		companyList.put(company.getId(), company);
		return true;
	}

	public List<Company> companies() {
		return new Vector<Company>(companyList.values());
	}

}
