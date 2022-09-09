package com.predifinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    static boolean isPersonEligibleForVoting(Person person,Integer minAge, BiPredicate<Person, Integer> predicate){
        return predicate.test(person, minAge);
    }

    public static void main(String args[]){

        // Predicate test

        Person person = new Person("Arjun", 29, "India");


        boolean eligible =
                isPersonEligibleForVoting(
                        person,
                        18,
                        (p, minAge) -> {
                            return p.getAge() > minAge;
                        }
                ); // Function boolean Call

        System.out.println("Person is eligble for voting: " + eligible);


    }
}
