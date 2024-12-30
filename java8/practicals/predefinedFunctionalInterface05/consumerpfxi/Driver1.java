// package javapgms.java8.practicals.predefinedFunctionalInterface.consumerpfxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Driver1 {
    public static void main(String[] args) {
        Consumer <Integer> ob1=n->System.out.println(n);
        ob1.accept(546);

        List <Integer> l1=Arrays.asList(10,20,30,40);
        l1.forEach(n->System.out.println(n));
    }   
}
