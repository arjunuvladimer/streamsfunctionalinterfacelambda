package com.predifinedFunctionalInterfaces;

import java.util.function.Consumer;

public class Consumeraccept {

    public static void main(String args[]){
        Consumer<String> employee1 = (arg) -> System.out.println("My name is Arjun " + arg);

        Consumer<String> employee2 = (arg) -> System.out.println("I am from India " + arg);

        employee1.andThen(employee2).accept("Hello");

    }
}
