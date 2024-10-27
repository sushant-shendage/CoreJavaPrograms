// package javapgms.javaBasics.control-flow-stmt.conditionalStmt;

import java.util.Scanner;

public class Conditionalstmt {

    public static void main(String[] args) {
        /*
         -control flow stmt
          -conditional stmt
           -if_else stmt
            -if stmt
            -if else stmt
            - if else if ladder stmt
            - if elfe if ladder else stmt
          -switch case stmt
          
         */

         //conditional operator also used to for desion making


         Scanner scanner = new Scanner(System.in);
        
         // If statement
         System.out.print("Enter a number for If statement: ");
         int numberIf = scanner.nextInt();
         if (numberIf > 0) {
             System.out.println(numberIf + " is positive.");
         }
 
         // If-else statement
         System.out.print("Enter a number for If-Else statement: ");
         int numberIfElse = scanner.nextInt();
         if (numberIfElse > 0) {
             System.out.println(numberIfElse + " is positive.");
         } else {
             System.out.println(numberIfElse + " is not positive.");
         }
 
         // Else-if ladder
         System.out.print("Enter a number for Else-if ladder: ");
         int numberElseIf = scanner.nextInt();
         if (numberElseIf > 0) {
             System.out.println(numberElseIf + " is positive.");
         } else if (numberElseIf < 0) {
             System.out.println(numberElseIf + " is negative.");
         } else {
             System.out.println("The number is zero.");
         }
 
         // Switch statement
         System.out.print("Enter a day number (1-7) for Switch statement: ");
         int day = scanner.nextInt();
         switch (day) {
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
             default:
                 System.out.println("Invalid day number. Please enter a number between 1 and 7.");
         }
 
         // Conditional (ternary) operator
         System.out.print("Enter a number for Conditional operator: ");
         int numberTernary = scanner.nextInt();
         String result = (numberTernary % 2 == 0) ? "Even" : "Odd";
         System.out.println(numberTernary + " is " + result + ".");
 
         // Closing the scanner
         scanner.close();
    }
}
