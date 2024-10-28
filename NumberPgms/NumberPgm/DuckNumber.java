// package javapgms.NumberPgms.popularNumPgm;

/**
 * Title: Duck Number Checker
 * 
 * This program checks if a given number is a Duck Number using two different approaches.
 * A Duck Number is defined as a positive integer that contains at least one '0' digit, 
 * but the '0' cannot be the leading digit.
 */

 public class DuckNumber {
    public static void main(String[] args) {

        // Approach 1: Using a loop and modulus to check for '0' in digits
        int number1 = 1298; // Given number
        int i; // Loop variable for processing digits

        // Loop through each digit by dividing by 10 in each iteration
        for (i = number1; i != 0; i /= 10) {
            // Check if the current last digit is '0'
            if (i % 10 == 0) {
                break; // Exit loop if '0' is found
            }
        }

        // After loop, if i is not zero, it means a '0' was found, so it's a Duck Number
        if (i != 0) {
            System.out.printf("%d is a Duck number..!\n", number1);
        } else {
            System.out.printf("%d is not a Duck number..!\n", number1);
        }

        //-------------------------------------------------------------------------------

        // Approach 2: Using String conversion to check if '0' exists in number
        int number2 = 120798; // Another test number

        // Convert number to String and use contains to check for '0'
        if ((number2 + "").contains("0")) {
            System.out.printf("\n%d is a Duck number..!\n", number2);
        } else {
            System.out.printf("\n%d is not a Duck number..!\n", number2);
        }

        //-------------------------------------------------------------------------------
    }
}

