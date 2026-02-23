package belajar.pakage.app;

import belajar.pakage.data.Company;

public class CompanyApp {
    static void main(String[] args) {

        Company company = new Company();
        company.setName("Belajar Iner Class");

        Company.Employee employee = company.new Employee();
        employee.setName("Bachtiar");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        
        Company company2 = new Company();
        company2.setName("testing company");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("dayat");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
