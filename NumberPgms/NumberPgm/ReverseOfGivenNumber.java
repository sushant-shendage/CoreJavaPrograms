// package javapgms.NumberPgms.popularNumPgm;

/**
 * Title: Reverse of a Given Number
 * 
 * This program demonstrates two different approaches to reverse a given integer number in Java.
 */
public class ReverseOfGivenNumber {
    public static void main(String[] args) {
        // Approach 1: Using a loop and modulus operation to reverse the number

        int num1 = 1234567; // Given integer to reverse
        int reverseNum = 0; // Variable to store the reversed number

        // Loop to reverse the number by extracting digits from right to left
        for (int i = num1; i != 0; i /= 10) {
            // Multiply the current reverseNum by 10 and add the last digit of i
            reverseNum = reverseNum * 10 + i % 10;
        }
        // Print the reversed number for Approach 1
        System.out.printf("Reverse of %d is %d", num1, reverseNum);

        // Approach 2: Using StringBuffer to reverse the number
        int num2 = 1234567; // Another integer to reverse

        // Convert num2 to a string, reverse it using StringBuffer, and parse it back to an integer
        System.out.printf("\nReverse of %d is %d", num2, Integer.parseInt(new StringBuffer(num2 + "").reverse().toString()));
    }
}

