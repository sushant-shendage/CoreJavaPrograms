import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class CollectionDriver {
    public static void main(String[] args) {

        //converting array to treeset
        System.out.println("===========================================");
        //converting arraylist to treeset
        ArrayList al1=new ArrayList<>(Arrays.asList(77,9,67,96,8,94,21,7,22,20));
System.out.println("al1 : "+al1);
        
        TreeSet<Integer> ts1= new TreeSet<>(al1);
System.out.println("ts1 : "+ts1);

        System.out.println("===========================================");


        //sorting element in desending order using treeset's constructor which takes comparator as argument
        TreeSet <Integer> ts2=new TreeSet<>((o1,o2)->o2-o1);
        ts2.add(77);
        ts2.add(9);
        ts2.add(67);
        ts2.add(96);
        ts2.add(38);
        ts2.add(94);
        ts2.add(21);

System.out.println("ts2 : "+ts2);

        System.out.println("===========================================");


        
    }

    
}
