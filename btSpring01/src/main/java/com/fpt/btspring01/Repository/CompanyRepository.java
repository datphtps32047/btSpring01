package com.fpt.btspring01.Repository;

import com.fpt.btspring01.Model.company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<company, Long> {
}
