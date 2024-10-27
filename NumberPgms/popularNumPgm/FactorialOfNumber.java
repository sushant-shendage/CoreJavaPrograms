// package javapgms.NumberPgms.popularNumPgm;

public class FactorialOfNumber {
    // Program: Factorial Calculation Using Different Approaches
// This program calculates the factorial of a given number using both iterative and recursive methods.
 
    public static void main(String[] args) {
        // Approach 1: Iterative method (using a for loop)
        int num1 = 7; // Number for which we want to calculate the factorial
        int fact = 1; // Variable to store the factorial result
        for (int i = 1; i <= num1; i++) {
            fact *= i; // Multiply fact by i for each iteration
        }
        System.out.printf("Factorial of %d is %d ", num1, fact);
        // -------------------------------------------------------------------------------------------

        // Approach 1.2: Iterative method (using a for loop, counting down)
        int num2 = 7; // Number for which we want to calculate the factorial
        int fact2 = 1; // Variable to store the factorial result
        for (int i = num2; i >= 1; i--) {
            fact2 *= i; // Multiply fact2 by i for each iteration
        }
        System.out.printf("\nFactorial of %d is %d ", num2, fact2);
        // -------------------------------------------------------------------------------------------

        // Approach 2: Recursive method
        int num3 = 7; // Number for which we want to calculate the factorial
        int fact3 = factfx(num3); // Call the recursive method to compute factorial
        System.out.printf("\nFactorial of %d is %d ", num3, fact3);
        // -------------------------------------------------------------------------------------------
    }

    // Recursive method to calculate factorial
    static int factfx(int num) {
        // Base case: if num is 0 or 1, return 1
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // Recursive case: return num multiplied by factorial of (num - 1)
            return num * factfx(num - 1);
        }
    }
}
