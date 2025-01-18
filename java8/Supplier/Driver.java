// package javapgms.java8.Supplier;

import java.util.function.Supplier;

public class Driver {
    public static void main(String[] args) {
        double pi=Math.PI;
        Supplier<Double> suppliervariable=()->Math.PI;
        System.out.println(suppliervariable);
        System.out.println(suppliervariable.get());


        Supplier suppliervariable2=()->Math.max(13,56);
        System.out.println(suppliervariable2.get());
        
        // Supplier suppliervariable3=()->Math.max(13,56);
    }
}
