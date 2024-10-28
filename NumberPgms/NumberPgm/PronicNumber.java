// Title: Pronic Number Checker
// This program checks if a given number is a pronic number or not.
// A pronic number is a product of two consecutive integers.

public class PronicNumber {
    public static void main(String[] args) {
        int number = 91; // The number to check for being a pronic number
        
        // Loop through numbers from 1 to the given number to check for pronic property
        for (int i = 1; i < number; i++) {
            // Check if the product of i and (i + 1) equals the given number
            if (i * (i + 1) == number) {
                System.out.printf("%d * %d = %d is a pronic number!%n", i, (i + 1), number);
                return; // Exit once a pronic number is found
            }
        }


        // If no pronic number is found, output that the number is not pronic
        System.out.printf("%d is not a pronic number.%n", number);
    }
}

/*
 * Time Complexity:
 * The time complexity of this algorithm is O(n), where n is the given number.
 * This is because the algorithm iterates from 1 to n-1, checking if the product 
 * of consecutive integers matches the given number. In the worst case, 
 * it may have to check all integers up to n-1 before concluding that the 
 * number is not a pronic number.
 */
