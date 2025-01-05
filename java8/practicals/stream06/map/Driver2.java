import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(77);
        intList.add(9);
        intList.add(67);
        intList.add(48);
        intList.add(57);
        intList.add(100);

        Stream<Integer> streamObject = intList.stream();
        Stream<Integer> streamObjectFilter = streamObject.filter(n -> n >= 50);
        Stream<Integer> streamObjectFiltermap = streamObjectFilter.map(n -> n * 2);
        List<Integer> ansList2 = streamObjectFiltermap.collect(Collectors.toList());
        ansList2.forEach(System.out::println);

        System.out.println(">>------------------------------->>");

        List<Integer> ansList = intList.stream().filter(n -> n >= 50).map(n -> n * 2).collect(Collectors.toList());
        ansList.forEach(System.out::println);

    }
}
