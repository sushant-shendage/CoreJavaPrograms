// package java8.java8_2025;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionalInterfaceDriver1 {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------\
        Predicate<Integer> positiveOrNegative = num -> num > 0;

        if (positiveOrNegative.test(78))
            System.out.println("number is positive..!");
        // ---------------------------------------------------------------------------------
        // number is positive..!
        // ---------------------------------------------------------------------------------/

        // ---------------------------------------------------------------------------------\

        Function<Integer, Integer> power3 = num -> num * num * num;
        System.out.println("cube of 3 : " + power3.apply(3));
        // ---------------------------------------------------------------------------------
        // cube of 3 : 27
        // ---------------------------------------------------------------------------------/

        // ---------------------------------------------------------------------------------\
        ArrayList<Integer> intValList = new ArrayList<>();
        // ---------------------------------------------------------------------------------

        for (int i = 1; i <= 30; i++, intValList.add(i));



        for (int i = 1; i <= 30; i++, intValList.add(i));



        // ---------------------------------------------------------------------------------

    }
}
