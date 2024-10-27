// package javapgms.NumberPgms.popularNumPgm;

// Program: Sum of First N Natural Numbers
// This program calculates the sum of the first N natural numbers using two different approaches.

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        // Approach 1: Using a for-loop to calculate the sum
        int numberLimit = 10;  // The limit up to which we want the sum of natural numbers
        int sum1 = 0;          // Variable to store the cumulative sum

        // Loop from 1 to numberLimit, adding each number to sum1
        for (int i = 1; i <= numberLimit; i++) {
            sum1 += i; // Add the current number (i) to sum1
        }
        System.out.printf("The sum of the first %d natural numbers is %d", numberLimit, sum1);

        // -----------------------------------------------------------------------------------------------------

        // Approach 2: Using the mathematical formula to calculate the sum directly
        int numberLimit2 = 10; // Limit up to which we want the sum
        int sum2 = 0;          // Sum of the first N natural numbers using formula

        // Formula: Sum = (n * (n + 1)) / 2
        System.out.printf("\nThe sum of the first %d natural numbers is %d", numberLimit2, (numberLimit2 * (numberLimit2 + 1)) / 2);

        // -----------------------------------------------------------------------------------------------------
    }
}

/*
Explanation of Optimized Approach:
Approach 2 is the optimized method because it uses a mathematical formula to calculate the sum in constant time (O(1) complexity),
regardless of the size of the numberLimit. In contrast, Approach 1 has a linear time complexity (O(n)) as it requires looping through
each number up to numberLimit, which becomes inefficient for large values of N.
*/
