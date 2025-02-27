/**
 * This class demonstrates all bitwise operators in Java.
 * Each operator is explained with its function and example.
 */
public class BitwiseOperatorsExample {
    /**
     * Main method to demonstrate bitwise operations.
     */
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        /**
         * Bitwise AND (&)
         * - Compares each bit of both numbers.
         * - Returns 1 if both bits are 1, otherwise 0.
         * - Example: 0101 & 0011 = 0001 (1 in decimal)
         */
        int andResult = a & b;
        System.out.println("Bitwise AND (5 & 3): " + andResult);

        /**
         * Bitwise OR (|)
         * - Compares each bit of both numbers.
         * - Returns 1 if at least one bit is 1.
         * - Example: 0101 | 0011 = 0111 (7 in decimal)
         */
        int orResult = a | b;
        System.out.println("Bitwise OR (5 | 3): " + orResult);

        /**
         * Bitwise XOR (^)
         * - Compares each bit of both numbers.
         * - Returns 1 if bits are different, otherwise 0.
         * - Example: 0101 ^ 0011 = 0110 (6 in decimal)
         */
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR (5 ^ 3): " + xorResult);

        /**
         * Bitwise Complement (~)
         * - Inverts all bits (flips 0s to 1s and 1s to 0s).
         * - Uses two’s complement representation.
         * - Example: ~5 (0101) = 1010 (interpreted as -6 in decimal)
         */
        int complementResult = ~a;
        System.out.println("Bitwise Complement (~5): " + complementResult); // Output: -6

        /**
         * Left Shift (<<)
         * - Moves bits to the left by the specified number of positions.
         * - Fills rightmost bits with 0.
         * - Example: 5 (0101) << 1 = 1010 (10 in decimal)
         */
        int leftShiftResult = a << 1;
        System.out.println("Left Shift (5 << 1): " + leftShiftResult);

        /**
         * Right Shift (>>)
         * - Moves bits to the right by the specified number of positions.
         * - Fills leftmost bits with the sign bit (preserves sign for negative numbers).
         * - Example: 8 (1000) >> 1 = 0100 (4 in decimal)
         */
        int rightShiftResult = 8 >> 1;
        System.out.println("Right Shift (8 >> 1): " + rightShiftResult);

        /**
         * Unsigned Right Shift (>>>)
         * - Moves bits to the right by the specified positions.
         * - Fills leftmost bits with 0 (does not preserve sign).
         * - Example:
         *   -8 (1111...1000 in binary, 32-bit representation) >>> 1
         *   Produces a large positive number.
         */
        int negativeNumber = -8;
        int unsignedRightShiftResult = negativeNumber >>> 1;
        System.out.println("Unsigned Right Shift (-8 >>> 1): " + unsignedRightShiftResult);
    }
}
