package com.CollegeApi.SpringBootApi;

import com.CollegeApi.SpringBootApi.Model.Company;
import com.CollegeApi.SpringBootApi.Model.Employee;
import com.CollegeApi.SpringBootApi.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApiApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiApplication.class, args);

	}
@Autowired
private EmployeeRepo employeeRepo;
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Kumar");
		employee.setEmailId("Ramesh1629@gmail.com");
		Company company=new Company();
		company.setName("Puma");
		employee.setCompany(company);
		employeeRepo.save(employee);

	}
}
