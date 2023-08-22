package org.example;
import DB.DbDriver;
import Employee.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Harry",25, "NY", "4", "IT", "Developer");



        // print all employees
        DbDriver dbDriver = new DbDriver();

        dbDriver.addEmployee(employee);

        try {
            dbDriver.getAllEmployees();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}