package com.streams.Optional;



import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStream {
    Map<Integer, Person1> personMap = new HashMap<>();

    public Optional<Person1> getPerson(Integer personId){
        return Optional.ofNullable(personMap.get(personId));
    }

    public  static  void main(String args[]){
        OptionalStream check = new OptionalStream();

        // Some Person with some ID
        Optional<Person1> obj1 = check.getPerson(32);

        if(obj1.isPresent()){
            System.out.println(obj1.get().getName());
        }else{
            System.out.println("No Person found with that ID");
        }

    }
}



 class Person1 {
    String name;
    int age;
    String country;

    Person1(String name){
        this.name = name;
    }
    public Person1(String name, int age, String country){
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
