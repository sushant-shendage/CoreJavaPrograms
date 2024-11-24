//  package javapgms.javaBasics.datatypes;

public class DataTypes1 {
    public static void main(final String[] args) {
        // Print the range of values for the byte data type
        System.out.println("Byte range   : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // Print the range of values for the short data type
        System.out.println("Short range  : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        // Print the range of values for the integer data type
        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // Print the range of values for the long data type
        System.out.println("Long range   : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // Print the range of values for the float data type
        System.out.println("Float range  : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // Print the range of values for the double data type
        System.out.println("Double range : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);




         
                // byte: 8 bits
                // Range: -128 to 127 (-2^7 to 2^7 - 1)
                final byte byteValue = 127;
                System.out.println("Byte value: " + byteValue);
        
                // short: 16 bits
                // Range: -32,768 to 32,767 (-2^15 to 2^15 - 1)
                final short shortValue = 32767;
                System.out.println("Short value: " + shortValue);
        
                // int: 32 bits
                // Range: -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31 - 1)
                final int intValue = 2147483647;
                System.out.println("Int value: " + intValue);
        
                // long: 64 bits
                // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63 - 1)
                final long longValue = 9223372036854775807L; // 'L' suffix denotes a long literal
                System.out.println("Long value: " + longValue);
        
                // float: 32 bits
                // Range: Approximately ±3.40282347E+38F (positive and negative)
                // Precision: Up to 7 decimal digits
                final float floatValue = 3.14f; // 'f' suffix denotes a float literal
                System.out.println("Float value: " + floatValue);
        
                // double: 64 bits
                // Range: Approximately ±1.79769313486231570E+308 (positive and negative)
                // Precision: Up to 15 decimal digits
                final double doubleValue = 3.141592653589793;
                System.out.println("Double value: " + doubleValue);
        
                // boolean: Depends on JVM; typically represented as 1 bit internally
                // Range: Only two values, true and false
                final boolean booleanValue = true;
                System.out.println("Boolean value: " + booleanValue);
        
                // char: 16 bits (Unicode character)
                // Range: '\u0000' (or 0) to '\uffff' (or 65,535), representing Unicode characters
                final char charValue = 'A';
                System.out.println("Char value: " + charValue);
            
        


        
    }
    
}
