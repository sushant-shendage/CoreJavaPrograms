// package javapgms.Exp;

import java.util.function.Function;
import java.util.function.Predicate;

public class PrimeNumber {
   
    public static void main(String[] args) {

        Predicate<Integer> booleanOperations = num -> {
            int i;
            for (i = num; i != 0; i /= 10) {
                if (i % 10 == 0)
                    break;
            }
            return i == num;
        };

        Function<Integer,Boolean> isPrime = num -> {
            int i;
            for (i = num; i != 0; i /= 10) {
                if (i % 10 == 0)
                    break;
            }
            return i == num;
        };
    
        if (booleanOperations.test(47)) {
            System.out.println("prime number..!");
        } else {
            System.out.println("NOT prime number..!");
        }

        if (isPrime.apply(47)) {
            System.out.println("prime number..!");
        } else {
            System.out.println("NOT prime number..!");
        }
    }
}
