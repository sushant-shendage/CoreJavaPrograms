// package javapgms.java8.practicals.predefinedFunctionalInterface.consumerpfxi;

import java.util.function.Consumer;

public class Driver1 {
    public static void main(String[] args) {
        Consumer <Integer> ob1=n->System.out.println(n);
        ob1.accept(546);
    }
    
}
