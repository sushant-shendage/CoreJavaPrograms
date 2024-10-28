// Title: Calculating the Least Common Multiple (LCM) of Two Numbers
// This program demonstrates three approaches to find the LCM of two numbers in Java.
// Approach 1: Incremental Search Method
// Approach 2: Multiplicative Factor Method
// Approach 3: Using GCD for Optimized LCM Calculation

public class LCM {
    public static void main(String[] args) {
        
        // Approach 1: Incremental Search Method
        int number1 = 34, number2 = 8;
        int big = (number1 > number2) ? number1 : number2;  // Start from the larger of the two numbers

        for (; ; big++) {
            if (big % number1 == 0 && big % number2 == 0) {  // Check if divisible by both
                System.out.printf("LCM of %d and %d using Approach 1 is %d%n", number1, number2, big);
                break;  // Exit once LCM is found
            }
        }
        
        // --------------------------------------------------------------------------------

        // Approach 2: Multiplicative Factor Method
        int number3 = 34, number4 = 8;
        int big2 = (number3 > number4) ? number3 : number4;  // Start with the larger number
        int i = 1;  // Factor multiplier
        
        for (; ; i++) {
            if ((big2 * i) % number3 == 0 && (big2 * i) % number4 == 0) {  // Check if divisible by both
                System.out.printf("LCM of %d and %d using Approach 2 is %d%n", number3, number4, big2 * i);
                break;  // Exit once LCM is found
            }
        }
        
        // --------------------------------------------------------------------------------

        // Approach 3: Using GCD for Optimized LCM Calculation
        int number5 = 34, number6 = 8;
        int gcd = findGCD(number5, number6);  // Calculate GCD of the two numbers
        int lcm = (number5 * number6) / gcd;  // Apply the LCM formula: (a * b) / GCD(a, b)
        
        System.out.printf("LCM of %d and %d using Approach 3 is %d%n", number5, number6, lcm);
    }

    // Method to calculate the GCD of two numbers using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

/*
 * Discussion of Approaches:
 *
 * Approach 1 (Incremental Search Method):
 * - This approach is straightforward but inefficient for larger numbers, as it increments by 1 each time.
 * - Time Complexity: High, as it performs many unnecessary checks.
 *
 * Approach 2 (Multiplicative Factor Method):
 * - This approach is more efficient than Approach 1, as it skips values by iterating in multiples of the larger number.
 * - However, it can still be slow for larger values as it relies on finding the LCM by trial and error.
 *
 * Approach 3 (Using GCD for Optimized LCM Calculation):
 * - This is the most efficient method, using the formula LCM(a, b) = (a * b) / GCD(a, b).
 * - Time Complexity: The Euclidean algorithm for GCD runs in O(log(min(a, b))), making this approach significantly faster.
 *
 * Conclusion:
 * - Approach 3 is the optimal solution, especially for larger values, due to its lower time complexity and minimal iterations.
 */
