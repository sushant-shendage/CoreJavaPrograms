// package javapgms.NumberPgms.popularNumPgm;

import java.lang.reflect.Array;

/**
 * Title: Sum of Digits in a Given Number
 * 
 * This program demonstrates two different approaches to calculate the sum of the digits 
 * of a given integer number in Java.
 */
public class SumOfDigitsInNumber {
    public static void main(String[] args) {

        // Approach 1: Using a loop and modulus operation to sum the digits--------------------------------------
        int intVar1 = 1234; // Given integer variable
        int sum = 0; // Variable to store the sum of digits

        // Loop to extract each digit from right to left
        for (int i = intVar1; i != 0; i /= 10) {
            // Add the last digit of 'i' to 'sum' using modulus operation
            sum += i % 10;
        }
        // Print the sum of digits for Approach 1
        System.out.printf("Sum of digits in %d: %d", intVar1, sum);
        //------------------------------------------------------------------------------------------------------

        // Approach 2: Converting the number to a string and iterating through each character-------------------
        int intVar2 = 345; // Another integer variable
        int sum2 = 0; // Variable to store the sum of digits for Approach 2

        // Convert the number to a character array and iterate through each digit
        for (char i : (intVar2 + "").toCharArray()) {
            // Convert each character back to an integer and add to sum2
            sum2 += Integer.parseInt(i + "");
        }

        // Print the sum of digits for Approach 2
        System.out.printf("\nSum of digits in %d: %d", intVar2, sum2);
        //------------------------------------------------------------------------------------------------------
    }
}
