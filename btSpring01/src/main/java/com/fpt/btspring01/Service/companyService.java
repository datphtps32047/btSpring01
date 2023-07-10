package com.fpt.btspring01.Service;

import com.fpt.btspring01.Model.company;

import java.util.List;
import java.util.Optional;

public interface companyService {
    company saveCompany(company company);
    Optional<company> getCompanyById(Long companyId);
    List<company> getAllCompanies();
    void deleteCompanyById(Long companyId);
}
