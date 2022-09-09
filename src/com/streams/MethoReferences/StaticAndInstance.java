package com.streams.MethoReferences;

import java.util.ArrayList;
import java.util.List;

public class StaticAndInstance {
    public  int getLength(String str){
        return str.length();
    }

    public static  int getStatictLength(String str){
        return str.length();
    }

    public static  void main(String args[]){
        List<String> lst = new ArrayList<>();

        lst.add("Arjun");
        lst.add("Steffi");
        lst.add("Michael");
        lst.add("Sam");

        StaticAndInstance obj1 = new StaticAndInstance();
        // General Static Methods
        lst.stream().mapToInt(s -> StaticAndInstance.getStatictLength(s)).forEach(System.out::println);
        // Static Method Reference
        lst.stream().mapToInt(StaticAndInstance::getStatictLength).forEach(System.out::println);

        // Genral Instace based Method
        lst.stream().mapToInt(s -> obj1.getLength(s)).forEach(System.out::println);
        // Instance based Method Reference
        lst.stream().mapToInt(obj1::getLength).forEach(System.out::println);


    }
}
