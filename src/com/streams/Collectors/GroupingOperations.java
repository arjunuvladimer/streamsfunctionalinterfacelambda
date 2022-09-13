package com.streams.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingOperations {
    public static void main(String args[]){
        // Grouping
        List<GroupEmployee> lst = new ArrayList<>();
        lst.add(new GroupEmployee("Arjun",21,20000,"India"));
        lst.add(new GroupEmployee("Steffi",20,56090,"Dubai"));
        lst.add(new GroupEmployee("Michael",18,45343,"UK"));
        lst.add(new GroupEmployee("Sam",17,543543, "Thailand"));
        lst.add(new GroupEmployee("Pooja",16,435345, "Indonesia"));
        lst.add(new GroupEmployee("Srinath",15,23423,"Bali"));

        // GroupBy
        Map<String,List<GroupEmployee>> employeeMap = lst.stream().collect(Collectors.groupingBy(GroupEmployee::getCountry));
        System.out.println(employeeMap);
    }
}



class GroupEmployee {
    String name;
    int age;
    int salary;

    String country;

    GroupEmployee(String name){
        this.name = name;
    }
    public GroupEmployee(String name, int age, int salary, String country){
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
        return "GroupEmployee {"+
                "name = '" +name + '\'' +
                ", age= "+ age+
                ", salary = " + salary +
                ", country = " + country +
                '}';
    }
}