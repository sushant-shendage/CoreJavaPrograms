// package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Driver1 {
    public static void main(String[] args) {
        LinkedList<Integer> intList1 = new LinkedList<>();
        intList1.add(77);
        intList1.add(9);
        intList1.add(67);
        intList1.add(22);
        intList1.add(20);
        System.out.println("original list :" + intList1);

        intList1.addFirst(100);
        intList1.addLast(900);
        intList1.add(1, 10);

        System.out.println("after adding first and last element 2nd element :" + intList1);

        System.out.println(" getting 1st element :" + intList1.getFirst());
        System.out.println(" getting last element :" + intList1.getLast());
        System.out.println(" getting 5th element :" + intList1.get(4));

        // removeFirst removeLast() remove(index:X)
        intList1.remove(2);
        intList1.removeLast();
        intList1.removeFirst();

        System.out.println("after removing first and last element 2nd element :" + intList1);

        System.out.println("removing  even element :");
        intList1.removeIf(n -> n % 2 == 0);
        System.out.println(intList1);

        System.out.println("removing  all element :");
        intList1.removeAll(intList1);
        System.out.println(intList1);
        intList1.add(77);
        intList1.add(9);
        intList1.add(67);
        intList1.add(22);
        intList1.add(20);
        System.out.println("other list  all element :");
        LinkedList<Integer> intList2 = new LinkedList<>();
        intList2.add(77);
        intList2.add(9);
        intList2.add(67);
        System.out.println(intList2);
        intList1.removeAll(intList2);

        System.out.println("removing  commonlist element :");
        intList1.removeAll(intList2);
        System.out.println(intList1);
    }
}
