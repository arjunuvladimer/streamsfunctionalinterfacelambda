package com.streams.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperations {
    public static void main(String args[]){
        // 1. Collect Method
        List<Person> lst = new ArrayList<>();
        lst.add(new Person("Arjun",29,20000,"India"));
        lst.add(new Person("Steffi",29,56090,"Dubai"));
        lst.add(new Person("Michael",29,45343,"UK"));
        lst.add(new Person("Sam",29,543543, "Thailand"));
        lst.add(new Person("Pooja",29,435345, "Indonesia"));
        lst.add(new Person("Srinath",29,23423,"Bali"));

        // List
        List<String> allNames = lst.stream().map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(allNames);


        // Set
        Set<String> personName = lst.stream().map(p -> p.getCountry()).collect(Collectors.toSet());
        System.out.println(personName);

        // Linked List
        LinkedList<String> namePerson = lst.stream().map(s -> s.getName()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(namePerson);

        // Map
        Map<String,Integer> personMap = lst.stream().collect(Collectors.toMap(s -> s.getName(), s->s.getName().length()));
        System.out.println(personMap);


    }
}


 class Person {
    String name;
    int age;
    int salary;

    String country;

    Person(String name){
        this.name = name;
    }
    public Person(String name, int age, int salary, String country){
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
        return "Person {"+
                "name = '" +name + '\'' +
                ", age= "+ age+
                ", salary = " + salary +
                ", country = " + country +
                '}';
    }
}
