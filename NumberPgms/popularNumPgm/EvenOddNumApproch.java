package javapgms.NumberPgms.popularNumPgm;
 

public class EvenOddNumApproch {
    public static void main(String[] args) {
        // Approach 1: Using Modulus Operator
        // The modulus operator (%) is used to find the remainder of division.
        // If the remainder when dividing by 2 is 0, the number is even; otherwise, it's odd.
        int num = 34; // Initialize a variable 'num' with a value to check
        if (num % 2 == 0) {
            // If num is evenly divisible by 2
            System.out.println(num + " is EVEN number..!");
        } else {
            // If num is not evenly divisible by 2
            System.out.println(num + " is ODD number..!");
        }

        // Approach 2: Using Division
        // This approach checks if the number is equal to the product of its half and 2.
        // If true, the number is even; otherwise, it's odd.
        int num2 = 35; // Initialize a second variable 'num2' with a different value to check
        if (num2 == ((num2 / 2) * 2)) {
            // If num2 is equal to (num2 divided by 2) multiplied back by 2
            System.out.println(num2 + " is EVEN number..!");
        } else {
            // If num2 does not satisfy the above condition
            System.out.println(num2 + " is ODD number..!");
        }

        // Approach 3: Using Bitwise AND Operator
        // The bitwise AND operator (&) checks the least significant bit (LSB).
        // If the LSB is 0, the number is even; if it is 1, the number is odd.
        int num3 = 36; // Initialize a third variable 'num3' to check
        if ((num3 & 1) == 0) {
            // If the least significant bit of num3 is 0
            System.out.println(num3 + " is even.");
        } else {
            // If the least significant bit of num3 is 1
            System.out.println(num3 + " is odd.");
        }

        // Approach 4: Using Conditional (Ternary) Operator
        // The conditional operator (?:) can be used to check if the number is even or odd.
        int num4 = 37; // Initialize a fourth variable 'num4' to check
        String result4 = (num4 % 2 == 0) ? num4 + " is EVEN number..!" : num4 + " is ODD number..!";
        System.out.println(result4); // Print the result using the conditional operator

        // Approach 5: Using Conditional (Ternary) Operator with Division
        int num5 = 38; // Initialize a fifth variable 'num5' to check
        String result5 = (num5 == ((num5 / 2) * 2)) ? num5 + " is EVEN number..!" : num5 + " is ODD number..!";
        System.out.println(result5); // Print the result using the conditional operator

        // Approach 6: Using Conditional (Ternary) Operator with Bitwise AND
        int num6 = 39; // Initialize a sixth variable 'num6' to check
        String result6 = ((num6 & 1) == 0) ? num6 + " is even." : num6 + " is odd.";
        System.out.println(result6); // Print the result using the conditional operator

        //3 logic x 2 ways
        //(use %,use *,use &)  X (use if eles ,use ternery)


        //keep this program at last
        //[*******************]write even odd code just using if statement
        int num7=88;

        if (num7%2==0) {
            System.out.println(num7+" is even num..!");
            return;
        }
        System.out.println(num7+" is odd num..!");


        


    }

}
