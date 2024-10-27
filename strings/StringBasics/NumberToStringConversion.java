// package javapgms.strings.StringBasics;

public class NumberToStringConversion {
    public static void main(String[] args) {
        int number = 123;

    // Method 1: Using String.valueOf()
    String str1 = String.valueOf(number);
    System.out.println("Using String.valueOf(): " + str1);

    // Method 2: Using Integer.toString()
    String str2 = Integer.toString(number);
    System.out.println("Using Integer.toString(): " + str2);

    // Method 3: Using String concatenation
    String str3 = number + "";
    System.out.println("Using String concatenation: " + str3);

    // Method 4: Using String.format()
    String str4 = String.format("%d", number);
    System.out.println("Using String.format(): " + str4);

    // Method 5: Using StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append(number);
    String str5 = sb.toString();
    System.out.println("Using StringBuilder: " + str5);

    System.out.println();
    }
}
