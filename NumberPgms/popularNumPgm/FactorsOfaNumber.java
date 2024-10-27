// package javapgms.NumberPgms.popularNumPgm;

// Program: Factors of a Number (Including Prime and Non-Prime Factors)
// This program calculates and prints both the factors of a given number,
// as well as its prime factors.

public class FactorsOfaNumber {
    public static void main(String[] args) {
        // Part 1: Factors of a Number (Prime and Non-Prime Factors)
        int number1 = 60; // The number to find factors for
        System.out.println("Factors of " + number1 + " (Prime and Non-Prime):");
        
        for (int i = 1; i <= number1; i++) { // Loop through all numbers from 1 to number1
            if (number1 % i == 0) { // Check if i is a factor of number1
                System.out.printf("Factor of %d is %d%n", number1, i); // Print the factor
            }
        }

        // Part 2: Factors of a Number (Only Prime Factors)
        System.out.println("\nPrime Factors of " + number1 + ":");
        int originalNumber = number1; // Store the original number for further calculations

        // Loop through possible factors from 2 to number1
        for (int i = 2; i <= originalNumber; i++) {
            // Check if i is a factor of number1
            while (originalNumber % i == 0) {
                System.out.printf("Prime factor of %d is %d%n", number1, i); // Print the prime factor
                originalNumber /= i; // Divide originalNumber by i
            }
        }
    }
}

