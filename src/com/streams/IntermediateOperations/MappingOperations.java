package com.streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingOperations {
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(23);
        intList.add(1);
        intList.add(2);
        intList.add(9);
        intList.add(10);
        intList.add(11);
        intList.stream().map(s -> s *2).forEach(System.out::println);

        // Array of Strings, return a new Array of String that includes those characters < 5
        // and change all of the Array of String to Uppercase
        // ["Arjun", "SOmerjljel","Check"] => [22,12]

        // MaptoInt
        List<String> stringList = new ArrayList<>();
        stringList.add("Arjun");
        stringList.add("Steffi");
        stringList.add("Michael");
        stringList.add("Sam");


        stringList.stream().mapToInt(s -> s.length()).forEach(System.out::println);

        // Flattening a stream

        List<List<String>> stringList2 = new ArrayList<>();
        stringList2.add(Arrays.asList("a","b","c"));
        stringList2.add(Arrays.asList("d","a","f"));
        stringList2.add(Arrays.asList("g","h","i"));

       Stream<List<String>> normalStream = stringList2.stream();

       // Flattening Stream
        Stream<String> flattendedStream = normalStream.flatMap(s -> s.stream());

        // Fliter Operation
        Stream<String> streamFiltered = flattendedStream.filter(s -> "a".equals(s));

        streamFiltered.forEach(System.out::println);






    }}
