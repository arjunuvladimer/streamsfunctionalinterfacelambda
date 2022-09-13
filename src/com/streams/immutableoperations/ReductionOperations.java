package com.streams.immutableoperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReductionOperations {

    // Reduce => Collection of Objects => Gives a Single Valued Result which is Immutable

    // Identity => Initial Value of the operation => default result => when your stream is empty
    // Accumulator => a,b => a[partial result]+b [next element of the stream]
    // Combiner => types of accumulator implementation.


    public static void main(String args[]){
        List<Person> lst = new ArrayList<>();
        lst.add(new Person("Arjun",29,20000));
        lst.add(new Person("Steffi",29,56090));
        lst.add(new Person("Michael",29,45343));
        lst.add(new Person("Sam",29,543543));
        lst.add(new Person("Pooja",29,435345));
        lst.add(new Person("Srinath",29,23423));

        // 1. Optional<T>reduce(BinaryOperator<T>accumulator)
        Optional<Integer> totalSalary = lst.stream().map(s -> s.getSalary()).reduce((p,q) -> p + q);

        if(totalSalary.isPresent()){
            System.out.println("The Total salary of all people:" + totalSalary);
        }else{
            System.out.println("No Records found");
        }




        // 2. T reduce(T identity, BinaryOperator<T>accumulator)
        List<Integer> lst2 = new ArrayList<>();

        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(6);
        lst2.add(4);
        lst2.add(5);
        lst2.add(8);





        int totalSum = lst2.stream().reduce(10,(p1, n) -> p1 + n);
        System.out.println("Total sum is" + totalSum);


        // 3. Combiner with parallel streams
        // 1 -> Stream -> 1.1 Stream -> 1.2 Stream -> 1.3 Stream
        // 12381209 + 3243242432343243 + 3342

        // Stream -> Payroll[Jan + Feb + Mar] Combiner
        // Sub Streams-> Jan[Sub]-> Number of Days Reduce -> Feb[Sub]-> Number of Days Reduce -> Mar[Sub] -> Number of Days Reduce

        int totalSum2 = lst2.parallelStream().reduce(2,(partialSum, num)-> partialSum + num, Integer::sum);

        // 4. max and min
        Optional<Integer> maxNum = lst2.stream().max(Comparator.naturalOrder());
        System.out.println(maxNum);
        Optional<Integer> minNum = lst2.stream().min(Comparator.naturalOrder());
        System.out.println(minNum);

    }

}

class Person {
    String name;
    int age = 10;
    int salary;

    Person(String name){
        this.name = name;
    }
    public Person(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Person {"+
                "name = '" +name + '\'' +
                ", age= "+ age+
                ", salary = " + salary +
                '}';
    }
}
