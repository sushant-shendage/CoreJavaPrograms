// package javapgms.NumberPgms.popularNumPgm;

/**
 * Title: Count of Digits in a Given Number
 * 
 * This program demonstrates two different approaches to count the number of digits 
 * in a given integer in Java.
 */
public class CountOFDigitsInGivenNumber {
    public static void main(String[] args) {
        
        // Approach 1: Using a loop and division to count digits---------------------------------------------
        int num1 = 235543; // Given integer
        int count = 0; // Variable to store the count of digits

        // Loop to remove each digit from right to left
        for (int i = num1; i != 0; i /= 10) {
            // Increment count for each digit removed
            count++;
        }
        // Print the count of digits for Approach 1
        System.out.printf("Total digits in %d: %d", num1, count);

        //----------------------------------------------------------------------------------------------------

        // Approach 2: Converting the number to a string to get the length-----------------------------------
        int num2 = 436456; // Another integer

        // Convert num2 to a string and get the length of the string, which represents the count of digits
        System.out.printf("\nTotal digits in %d: %d", num2, (num2 + "").length());

        //----------------------------------------------------------------------------------------------------
    }
}
