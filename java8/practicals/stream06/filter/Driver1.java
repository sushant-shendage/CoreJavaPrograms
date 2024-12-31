// package javapgms.java8.practicals.stream06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
    public static void main(String[] args) {
        List <Integer> list1= new ArrayList<Integer>() ;
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        Stream <Integer> streamVar= list1.stream();
        Predicate <Integer> p1=n->n%2==0;
        Stream <Integer> filter1=streamVar.filter(p1);
        List<Integer> collect1=filter1.collect(Collectors.toList());

        collect1.forEach(e->System.out.println(e));

        list1.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(e->System.out.println(e));
 
    }
    public static void add(int ...a){
System.out.println("sum"+a);
    }
}
