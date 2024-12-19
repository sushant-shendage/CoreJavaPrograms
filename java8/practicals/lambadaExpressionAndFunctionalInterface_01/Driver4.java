package javapgms.java8.practicals.lambadaExpressionAndFunctionalInterface_01;
import java.util.Comparator;
import java.util.TreeSet;

public class Driver4 {
    public static void main(String[] args) {
        Comparator<Integer> comparatorObject = (o1, o2) -> o2.compareTo(o1);
        TreeSet<Integer> treesetlist = new TreeSet<>(comparatorObject);
        treesetlist.add(77);
        treesetlist.add(9);
        treesetlist.add(67);
        treesetlist.add(48);
        treesetlist.add(57);
        System.out
                .println("changing default ordering of treeset collection(desending..!)-----------------------------");
        System.out.println(treesetlist);

    }
}
