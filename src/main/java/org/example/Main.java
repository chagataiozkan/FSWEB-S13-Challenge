package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        String[] plans = new String[3];
        String[] devs = new String[3];
        Employee employee = new Employee(1,"Ali Veli", "ali@mail.com", "1234", plans);
        employee.addHealthPlan(0, "BASIC");

        Company company = new Company(1, "Tech", 1000, devs);
        company.addEmployee(0, "Ali Veli");

        Healthplan healthplan = new Healthplan(1,"Ali Veli", Plan.BASIC);

        System.out.println(employee);
        System.out.println(company);
        System.out.println(healthplan);
    }
}