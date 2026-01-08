package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static Employees employees = new Employees();

    static {
        // Initialize with sample employees
        employees.getEmployeeList()
                .add(new Employee(1, "Prem"));
        employees.getEmployeeList()
                .add(new Employee(2, "Vikash"));
        employees.getEmployeeList()
                .add(new Employee(3, "Ritesh"));
    }

    public Employees getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }


}
