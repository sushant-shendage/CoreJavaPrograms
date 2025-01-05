 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Driver1minMaxCountmethod {
    public static void main(String[] args) {
        List <Integer> intList1=new ArrayList<>();
        intList1.add(77);
        intList1.add(9);
        intList1.add(67);

        //comparator object
        Comparator<Integer> comp=(o1,o2)->o1.compareTo(o2);

        //sorting list using stream  [sorted() method]
        intList1.stream().sorted(comp).forEach(System.out::println);
       
        //countmethod
        System.out.println("count:"+intList1.stream().count());

        //min method
        System.out.println("Min :"+intList1.stream().min(comp).get());
  
        //max method
        System.out.println("Max :"+intList1.stream().max(comp).get());

Stack <Integer> intvar=new Stack();
intvar.add(77);
intvar.add(9);
intvar.add(67);
intvar.add(48);
intvar.add(57);

System.out.println(intvar);
intvar.add(5, 55);
intvar.add(6, null);
intvar.add(6, null);


System.out.println(intvar);


    }
    
}
