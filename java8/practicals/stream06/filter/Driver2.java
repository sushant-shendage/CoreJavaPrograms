// package javapgms.java8.practicals.stream06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Driver2 {
    public static void main(String[] args) {
        List <Integer> list1= new ArrayList<Integer>() ;
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(44);
        list1.add(55);
        list1.add(66);

        list1.stream().filter(n->n>=15).collect(Collectors.toList()).forEach(e->System.out.println(e));
 
    }
}
