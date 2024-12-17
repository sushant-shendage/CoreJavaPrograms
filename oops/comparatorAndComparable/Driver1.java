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

        System.out.println("orginal integer list..!");
        System.out.println(listOfIntegers);

        //implicit sorting in asencending order by sort() method
        Collections.sort(listOfIntegers);
        System.out.println(listOfIntegers);


       //changing default sorting order by sort() and compare method of comparator functinal interface
        listOfIntegers.sort((i1,i2)->(int)i2-(int)i1);
        System.out.println(listOfIntegers);

    }
}
