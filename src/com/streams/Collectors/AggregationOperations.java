package com.streams.Collectors;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationOperations {
    public static void main(String args[]){
        List<Employee> lst = new ArrayList<>();
        lst.add(new Employee("Arjun",21,20000,"India"));
        lst.add(new Employee("Steffi",20,56090,"Dubai"));
        lst.add(new Employee("Michael",18,45343,"UK"));
        lst.add(new Employee("Sam",17,543543, "Thailand"));
        lst.add(new Employee("Pooja",16,435345, "Indonesia"));
        lst.add(new Employee("Srinath",15,23423,"Bali"));

        // Counting
        long count = lst.stream().filter(emp -> emp.getAge() > 18).collect(Collectors.counting());
        System.out.println(count);

        // Summing
        int sumSalary = lst.stream().collect(Collectors.summingInt(emp -> emp.getSalary()));
        System.out.println(sumSalary);

        // ToIntFunction
        double averageSalary = lst.stream().collect(Collectors.averagingInt(emp -> emp.getSalary()));
        double intAverageSalary = lst.stream().collect(Collectors.averagingLong(emp -> emp.getSalary()));

        // minBy
        Optional<Employee> minSalary = lst.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(minSalary);

        //maxBy
        Optional<Employee> maxSalary = lst.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(maxSalary);


        // Joining
        String joinAString = Stream.of("I am", "Arjun").collect(Collectors.joining());

    }
}


class Employee {
    String name;
    int age;
    int salary;

    String country;

    Employee(String name){
        this.name = name;
    }
    public Employee(String name, int age, int salary, String country){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

    public String getCountry(){
        return country;
    }

    @Override
    public String toString(){
        return "Employee {"+
                "name = '" +name + '\'' +
                ", age= "+ age+
                ", salary = " + salary +
                ", country = " + country +
                '}';
    }
}