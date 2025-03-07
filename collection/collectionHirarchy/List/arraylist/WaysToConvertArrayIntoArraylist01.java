import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This program demonstrates multiple ways to convert an array into an ArrayList in Java.
 */
public class WaysToConvertArrayIntoArraylist01 {
    public static void main(String[] args) {

        // Non-primitive Integer array (Wrapper Class)
        Integer arr[] = { 77, 9, 67, 48, 57 };

        /** 
         * [01] Using a loop to manually add elements into an ArrayList.
         * This approach allows for a fully mutable ArrayList.
         */
        ArrayList<Integer> arrayListVar1 = new ArrayList<>();
        for (int i : arr) {  // Iterating over the array
            arrayListVar1.add(i); // Adding elements manually
        }
        System.out.println("Using manual addition (fully mutable)                : " + arrayListVar1);

        /** 
         * [02] Using Arrays.asList(arr) - Creates an immutable list (fixed-size).
         * The resulting List cannot be modified (no add/remove operations allowed).
         */
        List<Integer> listVar = Arrays.asList(arr);
        System.out.println("Using Arrays.asList() (Immutable List)               : " + listVar);
        // listVar.add(100); // This will throw UnsupportedOperationException

        /** 
         * [03] Creating a mutable ArrayList using Arrays.asList() in the constructor.
         * This method allows modifications such as adding or removing elements.
         */
        ArrayList<Integer> arrayListVar2 = new ArrayList<>(Arrays.asList(arr));
        arrayListVar2.add(100); // Now we can add elements
        System.out.println("Using new ArrayList<>(Arrays.asList()) (Mutable List): " + arrayListVar2);

        /** 
         * [04] Using Collections.addAll() to convert an array into a mutable ArrayList.
         * This method is efficient and allows modifications.
         */
        ArrayList<Integer> arrayListVar3 = new ArrayList<>();
        Collections.addAll(arrayListVar3, arr); // Adding all elements from the array
        arrayListVar3.add(200); // Modifying the list is allowed
        System.out.println("Using Collections.addAll() (Mutable List)            : " + arrayListVar3);
    }
}
