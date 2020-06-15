package com.example.employeedashboard;

import com.example.employeedashboard.model.Employee;
import com.example.employeedashboard.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeDashboardApplication implements CommandLineRunner {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeDashboardApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDashboardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("john","Doe","john@email.com"));
        employeeRepository.save(new Employee("Sachin","Ramesh","ramesh@email.com"));
        employeeRepository.save(new Employee("Marry","Public","marry@email.com"));
        employeeRepository.save(new Employee("John","Thomson","johnt@email.com"));

    }
}
