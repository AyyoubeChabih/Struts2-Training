package org.mql.struts.business;

import java.util.List;

import org.mql.struts.models.Company;

public interface CompanyService {
	public boolean addCompany(Company company);
	public List<Company> companies();
}
