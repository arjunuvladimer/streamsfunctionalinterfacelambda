package com.predifinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String args[]){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Arjun",29, "India"));
        persons.add(new Person("Michael",19, "USA"));
        persons.add(new Person("Steffi",22, "Australia"));
        persons.add(new Person("Samantha",21, "Bhutan"));

        // getPerson Function
        List<Person> sortedPersons = PersonServiceWithComparator.getPersons(persons);
        System.out.println("Persons after Sorting");

        for(Person person: sortedPersons){
            System.out.println("Person Name " + person.getName());
        }

    }
}
