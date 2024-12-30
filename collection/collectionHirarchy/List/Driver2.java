import java.util.ArrayList;
import java.util.List;

public class Driver2 {
    public static void main(String[] args) {
        //list declaration    :way1
        List list1=new ArrayList();

        list1.add(45);
        list1.add("njd");

        //list declaration    :way2
        List list2=new ArrayList<>();
        list2.add(4565);
        list2.add("njdggd");

        //list declaration    :way3
        ArrayList list3=new ArrayList<>();
        list3.add(4895);
        list3.add("njdggd");

         
         
        ArrayList list4=new ArrayList();
        list4.add(67);
        list4.add(77);
        list4.add(90);
        list4.add(67);
        list4.add(48);
        list4.add(39);
        list4.add(11);

        System.out.println("way 1:printing list element using refrence variable :");
        System.out.println(list4);
        System.out.println("printing list of element by iterating using method refrence ");
        list4.forEach(System.out::println);

        System.out.println();
        System.out.println("printing list of element by iterating using for loop");
        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i)+"|");
        }

        System.out.println();
        System.out.println("printing list of element by iterating using forEach loop");
         for (Object i : list4) {
            System.out.print(i+" ");
         }
    }
}
