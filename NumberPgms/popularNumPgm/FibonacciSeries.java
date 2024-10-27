// package javapgms.NumberPgms.popularNumPgm;

// Program to Display Fibonacci Series up to a Given Limit

public class FibonacciSeries {
    public static void main(String[] args) {
        // Define the limit up to which Fibonacci series will be printed
        int limit = 10; 
        
        // Initialize the first two terms of the Fibonacci series
        int num1 = 0, num2 = 1, sum;

        // Print the Fibonacci series up to the specified limit
        for (int i = 1; i <= limit; i++) {
            System.out.print(num1 + " | ");
            
            // Calculate the next term in the series
            sum = num1 + num2;
            
            // Update variables for the next iteration
            num1 = num2;
            num2 = sum;
        }
    }
}

/*
 * Time Complexity:
 * - The time complexity of this iterative approach is O(n), where n is the limit.
 * - This is because the loop executes 'n' times to print the first 'n' terms of the Fibonacci series.
 *
 * Space Complexity:
 * - The space complexity of this approach is O(1), as it uses a fixed amount of memory for variables (num1, num2, sum) regardless of the size of 'n'.
 *
 * Conclusion:
 * - The iterative approach is efficient and optimized for calculating Fibonacci terms, especially when compared to the recursive approach.
 * - This program is both time and space efficient for large values of 'n'.
 */