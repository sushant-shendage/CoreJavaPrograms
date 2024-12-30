package Predicatefucnctionalinterface;
// package javapgms.java8.practicals.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class Driver2 {
    public static void main(String[] args) {
        Predicate<Object> isProperty = s -> s.toString().length() == 4;

        String arr[] = { "abcd", "difsd", "abhgcd" };

        for (String i : arr) {
            if (isProperty.test(i))
                System.out.println(i);
        }

        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        isProperty = s -> (Integer) s % 2 == 0;
        for (int i : arr2) {
            if (isProperty.test(i))
                System.out.print(i+" ");
        }

    }
}
