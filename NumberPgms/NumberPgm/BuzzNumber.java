// Title: Buzz Number Checker
// This program checks if a given number is a Buzz number.
// A Buzz number is defined as a number that is either divisible by 7 or ends with the digit 7.

public class BuzzNumber {
    public static void main(String[] args) {
        int number = 27; // The number to check for being a Buzz number

        // Check if the number is a Buzz number
        if (number % 7 == 0 || number % 10 == 7) {
            System.out.printf("%d is a Buzz number.%n", number);
        } else {
            System.out.printf("%d is not a Buzz number.%n", number);
        }
    }
}

/*
 * Time Complexity:
 * The time complexity of this algorithm is O(1) (constant time).
 * This is because the program performs a fixed number of arithmetic operations 
 * (two modulus operations and a couple of comparisons) regardless of the size of the input number.
 * Hence, it will always execute in constant time, making it very efficient.
 */
