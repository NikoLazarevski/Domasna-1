package com.example.project1.repository;

import com.example.project1.entity.Company;
import com.example.project1.entity.CompanyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface CompanyDataRepository extends JpaRepository<CompanyData, Long> {
    Optional<CompanyData> findByDateAndCompany(LocalDate date, Company company);
}
