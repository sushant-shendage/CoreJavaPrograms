import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class  Driver2{
public static void main(String[] args) {
    List <Integer> integerList=new ArrayList<>();
    integerList.add(77);
    integerList.add(0);
    integerList.add(9);
    integerList.add(67);
    integerList.add(48);
    integerList.add(57);

    Collections.sort(integerList);
    System.out.println(integerList);

    integerList.sort( new MyComparator());
    System.out.println(integerList);


    List <Integer> integerList2=new ArrayList<>();
    integerList2.add(797);
    integerList2.add(70);
    integerList2.add(97);
    integerList2.add(697);
    integerList2.add(468);
    integerList2.add(574);

    //non-primitive simngle value object sorting using comparator with lambda expression
    integerList2.sort((i1,i2)->i2-i1);
    System.out.println(integerList2);


}
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
       return o2-o1;
    }


    
}