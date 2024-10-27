// package javapgms.NumberPgms.BasicsOfNumPgm;
/**
 * Title: Extracting and Printing Digits of a Number
 * 
 * This program demonstrates three different approaches to extract and print 
 * each digit of a given integer number in Java.
 */
public class ExtractionOfDigits {
    public static void main(String[] args) {
        // Approach 1: Using a loop and modulus operation to extract digits
        int intVar1 = 12345678; // Given integer variable

        // Loop to extract digits from right to left
        for (int i = intVar1; i != 0; i /= 10) {
            // Print the last digit using modulus and then divide by 10
            System.out.println("Digit: " + (i % 10));
        }

        // Approach 2.1: Convert the number to a string and iterate through its length
        int num2 = 456789; // Another integer variable

        // Loop through each character in the string representation of the number
        for (int i = 0; i < (num2 + "").length(); i++) {
            // Convert each character back to an integer and print
            System.out.println("Digit: " + Integer.parseInt((num2 + "").charAt(i) + ""));
        }

        // Approach 2.2: Convert the number to a character array and iterate
        int num3 = 34456; // Another integer variable

        // Loop through each character in the character array of the number
        for (char i : (num3 + "").toCharArray()) {
            // Convert each character back to an integer and print
            System.out.println("Digit: " + Integer.parseInt(i + ""));
        }
    }
}
