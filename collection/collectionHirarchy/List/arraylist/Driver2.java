import java.util.ArrayList;
import java.util.List;

public class Driver2 {
    public static void main(String[] args) {
        // list declaration :way1
        List list1 = new ArrayList();

        list1.add(45);
        list1.add("njd");

        // list declaration :way2
        List list2 = new ArrayList<>();
        list2.add(4565);
        list2.add("njdggd");

        // list declaration :way3
        ArrayList list3 = new ArrayList<>();
        list3.add(4895);
        list3.add("njdggd");

        ArrayList list4 = new ArrayList();
        list4.add(67);
        list4.add(77);
        list4.add(90);
        list4.add(67);
        list4.add(48);
        list4.add(39);
        list4.add(11);
        list4.add(0, 99);//

        // iterating elemt using for loop
        System.out.println();
        System.out.println("printing list of element by iterating using for loop");
        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i) + "|");
        }

        // iterating eleement using forEach loop
        System.out.println();
        System.out.println("printing list of element by iterating using forEach loop");
        for (Object i : list4) {
            System.out.print(i + " ");
        }

        // iterating element using foreach and method refrence
        System.out.println("\nway 5:printing list element using refrence variable :");
        System.out.println(list4);
        System.out.println("printing list of element by iterating using method refrence ");
        list4.forEach(System.out::println);

        // iterating using iterator and list iterator

        // geting element by index
        System.out.println("\nget element by index :" + list4.get(5));

        // geting list size by index
        System.out.println("get list size by refrence variable:" + list4.size());

        // checking element is present or not in list
        System.out.println("checking element in collection is present or not :" + list4.contains(48));

        // add()OM,remove()OM

        // setting value
        list4.set(0, 100);
        System.out.println("updating element of list :");
        System.out.println(list4);
        list4.forEach(System.out::println);


        // remove [index][Integer.valueOf()]
        System.out.println("remove element  from list(index) :");
        list4.remove(0);
        list4.forEach(System.out::println);


        System.out.println("remove element  from list(index) :");
        list4.remove(Integer.valueOf(90));
        list4.forEach(System.out::println);

       //creating sub list

       //list to array conversion
        
System.out.println("list to array conversion :");
       //sorting array-list
       list4.sort(null);
        list4.forEach(System.out::println);

       System.out.println("desending order:");
        list4.sort((o1,o2)->(Integer)o2-(Integer)o1);
        list4.forEach(System.out::println);

        
    }

}
