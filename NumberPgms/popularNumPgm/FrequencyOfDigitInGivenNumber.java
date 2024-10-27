// package javapgms.NumberPgms.popularNumPgm;

// Program: Frequency of a Digit in a Given Number
// This program calculates the frequency of a specified digit within a given integer
// using two different approaches.

public class FrequencyOfDigitInGivenNumber {
    public static void main(String[] args) {
        
        // Approach 1: Using mathematical operations to isolate each digit
        int number1 = 3433456; // The number in which we want to find the frequency
        int targetDigit = 3;   // The digit whose frequency we want to calculate
        int count1 = 0;        // Counter to store the frequency of the target digit

        // Loop through each digit in the number by taking modulo and division operations
        for (int i = number1; i != 0; i /= 10) {
            if (i % 10 == targetDigit) { // Check if the last digit matches the target
                count1++; // Increment the count if there is a match
            }
        }
        System.out.printf("\nFrequency of digit %d in number %d: %d\n\n", targetDigit, number1, count1);

        // -------------------------------------------------------------------------------------------------------
        
        // Approach 2: Using String manipulation and indexOf() to find occurrences of the target digit
        int number2 = 343345;       // Another number to check frequency in
        int count2 = 0;             // Counter for the frequency of the target digit in number2
        String numInString = number2 + ""; // Convert the number to a string for easier manipulation
        int index = numInString.indexOf(targetDigit + ""); // Find the first occurrence of the target digit

        // If the target digit exists in the string, increment count and find further occurrences
        if (index >= 0) {
            count2++; // Initial count for the first found instance
        }
        while (index >= 0) { // Loop through the string to find all occurrences of the target digit
            index = numInString.indexOf(targetDigit + "", index + 1); // Find the next occurrence
            if (index > 0) { // If an occurrence is found (index != -1), increment count
                count2++;
            } 
        }
        System.out.printf("Frequency of digit %d in number %d: %d", targetDigit, number2, count2);

        // -------------------------------------------------------------------------------------------------------
    }
}
