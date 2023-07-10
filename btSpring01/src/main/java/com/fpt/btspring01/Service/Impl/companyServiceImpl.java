package com.fpt.btspring01.Service.Impl;

import com.fpt.btspring01.Model.company;
import com.fpt.btspring01.Repository.CompanyRepository;
import com.fpt.btspring01.Service.companyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class companyServiceImpl implements companyService {
    private final CompanyRepository companyRepository;
    @Autowired
    public companyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public company saveCompany(company company) {
        return companyRepository.save(company);
    }

    @Override
    public Optional<company> getCompanyById(Long companyId) {
        return companyRepository.findById(companyId);
    }

    @Override
    public List<company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void deleteCompanyById(Long companyId) {
        companyRepository.deleteById(companyId);
    }
}
