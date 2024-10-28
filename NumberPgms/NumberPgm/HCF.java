// Title: Calculating the Highest Common Factor (HCF) of Two Numbers
// This program demonstrates three methods to find the HCF/GCD of two numbers in Java.
// Method 1: Using the Euclidean Algorithm
// Method 2: Using Prime Factorization
// Method 3: Using a Brute Force Approach

public class HCF {
    public static void main(String[] args) {
        int number1 = 56, number2 = 98;

        // Method 1: Using the Euclidean Algorithm------------------------------------------------------------------
        int hcfEuclidean = findHCFUsingEuclidean(number1, number2);
        System.out.printf("HCF of %d and %d using Euclidean Algorithm is: %d%n", number1, number2, hcfEuclidean);
        //----------------------------------------------------------------------------------------------------------

        // Method 2: Using Prime Factorization---------------------------------------------------------------------- 
        int hcfPrimeFactorization = findHCFUsingPrimeFactorization(number1, number2);
        System.out.printf("HCF of %d and %d using Prime Factorization is: %d%n", number1, number2, hcfPrimeFactorization);
        //----------------------------------------------------------------------------------------------------------

        // Method 3: Using a Brute Force Approach-------------------------------------------------------------------
        int small = (number1 < number2) ? number1 : number2; // Determine the smaller of the two numbers
        for (;  ;small-- ) { // Start from the smaller number and decrement
            if (number1 % small == 0 && number2 % small == 0) { // Check if 'i' is a common factor
                System.out.printf("HCF of %d and %d using Brute Force Approach is: %d%n", number1, number2, small);
                break; // Exit loop once HCF is found
            }
        }
        //----------------------------------------------------------------------------------------------------------
    }

    // Method to calculate HCF using the Euclidean Algorithm
    public static int findHCFUsingEuclidean(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Return the HCF
    }

    // Method to calculate HCF using Prime Factorization
    public static int findHCFUsingPrimeFactorization(int a, int b) {
        int hcf = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            while (a % i == 0 && b % i == 0) {
                hcf *= i; // Multiply the prime factor to the HCF
                a /= i;   // Divide a by the prime factor
                b /= i;   // Divide b by the prime factor
            }
        }
        return hcf; // Return the HCF
    }
}
