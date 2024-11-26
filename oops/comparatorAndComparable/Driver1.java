// package javapgms.oops.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver1 {
    public static void main(String[] args) {

        ArrayList listOfIntegers=new ArrayList<>();
        listOfIntegers.add( 12);
        listOfIntegers.add( 24);
        listOfIntegers.add( 88);
        listOfIntegers.add( 34);
        listOfIntegers.add( 26);
        listOfIntegers.add( 56);

        System.out.println(listOfIntegers);

        Collections.sort(listOfIntegers);
        System.out.println(listOfIntegers);

 

        
    }
    
}
