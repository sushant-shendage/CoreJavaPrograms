
import java.util.ArrayList;
import java.util.Arrays;

public class Arrlist27july24 {
    public static void main(String[] args) {
        ArrayList al1= new ArrayList<>();

        al1.add(11);
        al1.add(11.11f);
        al1.add(11.123d);
        al1.add('A');
        al1.add("this is String");
        al1.add(true);
        al1.add(Arrays.toString(new int[2]));

        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i)+",");
        }
        System.out.println();
        for (Object o1 : al1) {
            System.out.print(o1+",");
        }
    }
    
}
