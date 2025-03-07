import java.util.LinkedList;

/**
 * The {@code Driver5} class demonstrates the usage of {@link LinkedList} in Java.
 * It verifies that LinkedList maintains the order of insertion.
 *
 * <p>Features of LinkedList:
 * <ul>
 *     <li>Maintains insertion order</li>
 *     <li>Allows duplicate values</li>
 *     <li>Supports dynamic memory allocation</li>
 *     <li>Implements the {@code List} and {@code Deque} interfaces</li>
 * </ul>
 *
 * <p>This program adds integers from 1 to 10 to a LinkedList
 * and prints the final size of the collection to confirm successful insertion.
 * </p>

 */
public class Driver5 {

    /**
     * The main method that executes the program.
     * <p>It initializes a {@code LinkedList<Integer>}, adds 10 elements to it,
     * and then prints the size of the LinkedList.</p>
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Creating a LinkedList of Integer type
        LinkedList<Integer> linkedlistVar = new LinkedList<>();

        // Adding elements 1 to 10 to the LinkedList
        for (int i = 1; i <= 10; i++)
            linkedlistVar.add(i);

        // Printing the final size of the LinkedList
        System.out.println("Size :: " + linkedlistVar.size());
    }
}
