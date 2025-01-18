// package java8.practicals.stream06.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            li.add(i);
        }

        int evenCount = li.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()).size();
        System.out.println(evenCount);

        // reduce function in stream
        evenCount = li.stream().reduce(0, (count, num) -> (num % 2 == 0) ? count + 1 : count);
        System.out.println(evenCount);

        // limit() function
        li.stream().limit(3).forEach(print -> System.out.println(print));

        // sAgAr NOONE --> sagar noone

        List<String> li2 = new ArrayList<>();
        li2.add("sAgAr");
        li2.add("NOONE");

        String result = li2.stream().reduce("", (s1, s2) -> s1.toLowerCase() + "" + s2.toUpperCase().trim());
        System.out.println(result);

        
        List<String> li3 = new ArrayList<>();
        li3.add("pythonlovesJava");
        String result2 = li2.stream().reduce("", (s1, s2) -> s1.replace(s1.charAt(0) + ""));
        System.out.println(result2);
        
        // Assignment1:q2 USE ONLY reduce()
        // pythonlivesJava-->PythonlivesJava
        
        
        // Assignment2: USE ONLY limit()
        // Q1:orange--> oRaNgE
        // q2:demo-->DeMo
    }
}