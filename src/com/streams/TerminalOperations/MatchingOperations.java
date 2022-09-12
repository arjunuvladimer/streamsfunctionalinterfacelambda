package com.streams.TerminalOperations;

import com.predifinedFunctionalInterfaces.Person;

import java.util.ArrayList;
import java.util.List;

public class MatchingOperations {
    public static void main(String args[]){
        // AnyMatch
        // -> if any element matches => true
        // -> if no element matches => false
        // -> stream is empty => false


        // 1. Check if any person who belongs to India
        // 2. Check if all persons are less then the age of 30
        // 3. Check if none of the persons name starts with letter K

        // AllMatch
        //  -> every element matches with the input => true
        //  -> Stream is empty => true
        //  -> Any single element doesn't match => false

        // NoneMatch
        //  -> If no element matches => true
        //  -> If the stream is empty => true
        //  -> If single element matches criteria => false
        ArrayList<Person> person=new ArrayList<>();
        person.add(new Person("abc",10,"AUS"));
        person.add(new Person("def",20,"US"));
        person.add(new Person("ghi",15,"UK"));

        boolean anyIndian=person.stream().anyMatch(s->s.getCountry().equals("IND"));
        System.out.println("anyone from IND: "+anyIndian);
        person.add(new Person("jkl",12,"IND"));
        anyIndian=person.stream().anyMatch(s->s.getCountry().equals("IND"));
        System.out.println("anyone from IND: "+anyIndian);


        boolean allLessThan=person.stream().allMatch(s->s.getAge()<30);
        System.out.println("all less than 30: "+allLessThan);
        person.add(new Person("mno",31,"IND"));
        allLessThan=person.stream().allMatch(s->s.getAge()<30);
        System.out.println("all less than 30: "+allLessThan);

        Boolean noneStartsWithK=person.stream().noneMatch(s->s.getName().charAt(0)=='k');
        System.out.println("none name starts with k: "+noneStartsWithK);
        person.add(new Person("kmno",31,"IND"));
        noneStartsWithK=person.stream().noneMatch(s->s.getName().charAt(0)=='k');
        System.out.println("none name starts with k: "+noneStartsWithK);



    }
}
