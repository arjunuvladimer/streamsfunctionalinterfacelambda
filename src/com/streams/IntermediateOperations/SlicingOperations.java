package com.streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class SlicingOperations {
    public static void main(String args[]){
        // Distinct Method
        // Remove Duplicates
        // Limit => Limiting the max size
        // Skip
        List<String> stringList = new ArrayList<>();
        stringList.add("Arjun");
        stringList.add("Steffi");
        stringList.add("Michael");
        stringList.add("Sam");
        stringList.add("Arjun");
        stringList.add("Michael");

        // 4 Distinct Elements limited to 3 elements by skipping 1 element from the start
        stringList.stream().distinct().limit(3).skip(1).forEach(System.out::println);


    }
}
