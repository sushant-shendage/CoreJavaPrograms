// package javapgms.java8.practicals.stream06.con2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
    // Approch 1:double the elements in collection using forEach loop/(WITHOUT
    // STREAM)
    // Approch 2:using stream API

    public static void main(String[] args) {

        
        
        
      
        
        // Approch 2:using stream API
        List<Integer> intList = new ArrayList<>();
        intList.add(77);
        intList.add(9);
        intList.add(67);
        intList.add(48);
        intList.add(57);
        intList.add(100);

        // streamof integer : intList.stream().map()
        // collector argument=collectors.toX()
        intList.stream().map(n -> n * 2).forEach(System.out::println);
        System.out.println("--------------------------------");
        List<Integer> dobleIntList = intList.stream().map(n -> n * 2).collect(Collectors.toList());
        dobleIntList.forEach(System.out::println);

    }
}
