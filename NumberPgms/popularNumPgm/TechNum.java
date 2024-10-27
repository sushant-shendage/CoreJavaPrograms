// package javapgms.NumberPgms.popularNumPgm;

public class TechNum {
  // Program to Check if a Number is a Tech Number

public class TechNum {
    public static void main(String[] args) {

        // Approach 1: Using Mathematical Calculations
        // ---------------------------------------------
        int num = 2029;
        int count = 0, sum = 0;

        // Counting the number of digits in the given number
        for (int i = num; i != 0; i /= 10) {
            count++;
        }

        // Checking if the number has an even number of digits
        if (count % 2 == 0) {
            // Splitting the number into two equal parts and summing them
            sum = num / powfx(10, count / 2) + num % powfx(10, count / 2);

            // Checking if the square of the sum equals the original number
            if (powfx(sum, 2) == num) {
                System.out.printf("\n%d is a Tech Number!", num);
            } else {
                System.out.printf("\n%d is not a Tech Number!", num);
            }
        } else {
            System.out.printf("\n%d is not a Tech Number!", num);
        }
        // ---------------------------------------------

        // Approach 2: Using String Manipulation
        // ---------------------------------------------
        int num2 = 2029;

        // Splitting the number into two parts by substring, converting them to integers, and summing
        int leftPart = Integer.parseInt((num2 + "").substring(0, (num2 + "").length() / 2));
        int rightPart = Integer.parseInt((num2 + "").substring((num2 + "").length() / 2));

        // Checking if the square of the sum of parts equals the original number
        if (powfx(leftPart + rightPart, 2) == num2) {
            System.out.printf("\n%d is a Tech Number!", num2);
        } else {
            System.out.printf("\n%d is not a Tech Number!", num2);
        }
        // ---------------------------------------------
    }

    // Method to calculate power (exponentiation)
    static int powfx(int base, int index) {
        int prod = 1;
        for (int i = 1; i <= index; i++) {
            prod *= base;
        }
        return prod;
    }
}

/*
 * Conclusion:
 * Approach 2 (String Manipulation) is more optimized as it involves fewer
 * operations for dividing and calculating powers, making it more concise and readable.
 * By treating the number as a string and using substring operations, this approach
 * reduces computational complexity and is efficient for large numbers.
 */
