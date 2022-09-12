package com.streams.TerminalOperations;

import com.predifinedFunctionalInterfaces.Person;

import java.util.ArrayList;
import java.util.Optional;

public class FindingOperations {
    public static void main(String args[]){
        // FindFirst
        // FindAny

        ArrayList<Person2> lst=new ArrayList<>();
        lst.add(new Person2("ghi",15,"UK"));
        lst.add(new Person2("abc",10,"AUS"));
        lst.add(new Person2("def",20,"US"));
        lst.add(new Person2("dfasf",15,"UK"));
        lst.add(new Person2("abc",10,"AUS"));
        lst.add(new Person2("dfasf",15,"UK"));

        Optional<Person2> p = lst.stream()
                .filter(s -> s.getCountry().equals("UK"))
                .findAny();

        if(p.isPresent()){
            System.out.println(p);
        }else{
            System.out.println("No Records Found");
        }
    }
}

class Person2 {
    String name;
    int age;
    String country;

    Person2(String name){
        this.name = name;
    }
    public Person2(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
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
    public String getCountry(){
        return country;
    }

    @Override
    public String toString(){
        return "Person1 {"+
                "name = '" +name + '\'' +
                ", age= "+ age+
                ", country = " + country +
                '}';
    }
}
