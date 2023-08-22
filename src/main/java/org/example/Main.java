package org.example;
import DB.DbDriver;
import Employee.Employee;

public class Main {
    public static void main(String[] args) {

        DbDriver dbDriver = new DbDriver();
        try {
            dbDriver.getAllEmployees();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}