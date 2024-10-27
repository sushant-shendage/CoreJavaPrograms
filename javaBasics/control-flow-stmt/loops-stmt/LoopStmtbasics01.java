// package javapgms.javaBasics.control-flow-stmt.loops-stmt;

public class LoopStmtbasics01 {
    public static void main(String[] args) {
        // For Loop
        // Use a for loop when you know the number of iterations in advance.
        // For example, iterating over a fixed range of numbers.
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // While Loop
        // Use a while loop when the number of iterations is not known beforehand.
        // It's suitable for situations where you want to continue looping until a specific condition is met.
        System.out.println("\nWhile Loop:");
        int j = 1; // Initialization of the counter variable
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++; // Increment the counter
        }

        // Do-While Loop
        // Use a do-while loop when you want the loop to execute at least once,
        // regardless of whether the condition is true or false at the beginning.
        System.out.println("\nDo-While Loop:");
        int k = 1; // Initialization of the counter variable
        do {
            System.out.println("Number: " + k);
            k++; // Increment the counter
        } while (k <= 5); // The loop continues until k is greater than 5

        // For-Each Loop
        // Use a for-each loop when you want to iterate over elements in an array or a collection.
        // It's ideal for situations where you don't need to modify the elements.
        System.out.println("\nFor-Each Loop:");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Array containing numbers from 1 to 10
        for (int number : numbers) {
            System.out.println("Number: " + number); // Print each number in the array
        }
    
    }
    
}
