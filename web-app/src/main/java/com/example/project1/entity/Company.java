package com.example.project1.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "companies")
@lombok.Data
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "last_updated")
    private LocalDate lastUpdated;

    @OneToMany
    private List<CompanyData> historicalData;

    public Company(String companyCode) {
        this.companyCode = companyCode;
    }

}
