package com.predifinedFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierUsage {



    public static void main(String args[]){

        Employee emp1 = new Employee("Arjun",29);
        System.out.println(emp1.getName());
        Payroll payroll = new Payroll("Arjun",29);
        System.out.println(emp1.getName());

        Supplier<Employee> employeeSupplier = () -> new Employee("Michael",18);
        Supplier<Payroll> payrollSupplier = () -> new Payroll("Michael",18);


    }
}

class Employee{
    private String name;
    private int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Payroll{
    private String name;
    private int age;
    Payroll(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
