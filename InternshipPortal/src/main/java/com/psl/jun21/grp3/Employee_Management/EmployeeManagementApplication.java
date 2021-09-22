package com.psl.training.Employee_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.psl.training.Employee_Management.model.Company;
import com.psl.training.Employee_Management.model.InternshipProfile;
import com.psl.training.Employee_Management.repository.CompanyRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public void run(String... args) throws Exception {
//		Company company1 = new Company(1, "Persistent System", "IT", "0912267584");
//		companyRepository.save(company1);
//		Company company1 = new Company(3, "Persistent System", "IT", "0912267584");
//		companyRepository.save(company1);
//		Company company1 = new Company(5, "Sysco Labs", "IT", "091226634");
//		companyRepository.save(company1);

		Company company2 = new Company(4, "WSO2", "IT", "0912267584");
		InternshipProfile p1 = new InternshipProfile("Associate Quality Assurance Engineer","IT","some description on AQAE",6);
		InternshipProfile p2 = new InternshipProfile("Associate Software Engineer","IT","some description on ASE",8);
		InternshipProfile p3 = new InternshipProfile("Senior Business Analyst","IT","some description on SBA",12);
		company2.getInternshipProfiles().add(p1);
		company2.getInternshipProfiles().add(p2);
		company2.getInternshipProfiles().add(p3);
		companyRepository.save(company2);
	}

}
