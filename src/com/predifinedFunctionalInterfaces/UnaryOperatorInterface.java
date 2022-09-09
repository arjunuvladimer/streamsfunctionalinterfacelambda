package com.predifinedFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String args[]){
        Person person = new Person();

        UnaryOperator<Person> uo = (p) -> {
            p.name ="Arjun";
            p.age = 29;
            p.country = "India";
            return p;
        };
        uo.apply(person);
        System.out.println("Person Name:"  + person.getName() + "Person Age:" + person.getAge());
    }
}
