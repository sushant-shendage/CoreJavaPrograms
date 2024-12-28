// package javapgms.java8.practicals.predefinedFunctionalInterface.functionPredefinedFunctionalInterface;

import java.time.LocalDate;
import java.util.function.Function;

import javafx.util.converter.LocalDateStringConverter;

public class Driver2 {
    public static void main(String[] args) {
        Function <String ,String> f1=n->"reversed string :"+new StringBuffer(n).reverse().toString();
        System.out.println(f1.apply("java"));

        Function <Integer ,Integer> f2=n->2024-n;
        System.out.println("Age :"+f2.apply(2004));
    }
}
