// Title: Various Approaches to Swap Two Numbers in Java
// This program demonstrates different methods to swap two numbers without using additional data structures.

public class NumberSwapping {

    public static void main(String[] args) {

        // Approach 1: Swapping using a third variable
        // This approach uses an extra variable to store the value of one number temporarily during swapping.
        int number1 = 55, number2 = 19;
        int temp;

        System.out.printf("Approach 1 (Using Third Variable) - \nBefore swap: num1 = %d, num2 = %d%n", number1, number2);

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.printf("After swap: num1 = %d, num2 = %d%n", number1, number2);

        // -------------------------------------------------------------------------------------------------------

        // Approach 2.1: Swapping without using a third variable (Using Addition and Subtraction)
        // This approach uses arithmetic operations to swap values without an additional variable.
        int number3 = 56, number4 = 20;

        System.out.printf("Approach 2.1 (Addition and Subtraction) - \nBefore swap: num1 = %d, num2 = %d%n", number3, number4);

        number3 = number3 + number4;
        number4 = number3 - number4;
        number3 = number3 - number4;

        System.out.printf("After swap: num1 = %d, num2 = %d%n", number3, number4);

        // -------------------------------------------------------------------------------------------------------

        // Approach 2.2: Swapping without using a third variable (Using Multiplication and Division)
        // This approach uses multiplication and division to swap values without an additional variable.
        // Note: This approach should be avoided if one of the numbers could be zero, as it may cause division by zero.
        int number5 = 57, number6 = 21;

        System.out.printf("Approach 2.2 (Multiplication and Division) - \nBefore swap: num1 = %d, num2 = %d%n", number5, number6);

        number5 = number5 * number6;
        number6 = number5 / number6;
        number5 = number5 / number6;

        System.out.printf("After swap: num1 = %d, num2 = %d%n", number5, number6);

        // -------------------------------------------------------------------------------------------------------

        // Approach 3: Swapping using Bitwise XOR Operator
        // This approach uses XOR bitwise operations to swap values without an additional variable.
        int number7 = 58, number8 = 22;

        System.out.printf("Approach 3 (Bitwise XOR) - \nBefore swap: num1 = %d, num2 = %d%n", number7, number8);

        number7 = number7 ^ number8;
        number8 = number7 ^ number8;
        number7 = number7 ^ number8;

        System.out.printf("After swap: num1 = %d, num2 = %d%n", number7, number8);

        // -------------------------------------------------------------------------------------------------------
    }
}

/*
 * Complexity Analysis:
 *
 * Approach 1 (Using Third Variable):
 * Time Complexity: O(1)
 * Space Complexity: O(1) (requires one extra variable)
 *
 * Approach 2.1 (Using Addition and Subtraction):
 * Time Complexity: O(1)
 * Space Complexity: O(1) (no extra variable)
 * Notes: Can result in integer overflow with large values.
 *
 * Approach 2.2 (Using Multiplication and Division):
 * Time Complexity: O(1)
 * Space Complexity: O(1) (no extra variable)
 * Notes: Risk of division by zero if either number is zero.
 *
 * Approach 3 (Using Bitwise XOR):
 * Time Complexity: O(1)
 * Space Complexity: O(1) (no extra variable)
 * Notes: Works only with integer values, but avoids overflow issues.
 *
 * Conclusion:
 * The optimal approach depends on the context:
 * - For integer values where overflow or division by zero is a concern, the Bitwise XOR approach (Approach 3) is recommended.
 * - The Addition and Subtraction method (Approach 2.1) is straightforward but may overflow.
 * - The Third Variable approach (Approach 1) is simple and works reliably but requires an extra variable.
 */
