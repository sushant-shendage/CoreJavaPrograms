import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver4ListTOset {
    public static void main(String[] args) {
        List <Integer> intList= new ArrayList();
        intList.add(77);
        intList.add(90);
        intList.add(67);
        intList.add(67);
        intList.add(48);
        intList.add(57);
        intList.add(57);


        intList.forEach(System.out::println);


        System.out.println("----------------------------------");
        Set <Integer> intSet=new HashSet<Integer>(intList);
        intSet.forEach(System.out::println);

        //strea


        
    }
}

