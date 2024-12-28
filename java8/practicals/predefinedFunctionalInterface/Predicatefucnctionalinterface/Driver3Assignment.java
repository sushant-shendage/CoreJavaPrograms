// package Predicatefucnctionalinterface;

/**
 * Date  : [28/12/2014]
 * Title : Predicate-Based Validation Program
 * 
 * Description:
 * This program demonstrates the use of Java's Predicate functional interface 
 * for performing various validations and checks. It includes examples such as 
 * email validation, password strength checking, phone number validation, 
 * discount eligibility, and examination pass criteria.
 * 
 */

 import java.util.function.Predicate;

 public class Driver3Assignment {
     public static void main(String[] args) {
         // Program for email validation
         Predicate<Object> isProperty = n -> (n.toString().contains("@gmail.com")) 
                 && (n.toString().length() - 10 > 1)
                 && (n.toString().charAt(0) > '0' && n.toString().charAt(0) > '9');
         System.out.println("1] Valid email         :" + isProperty.test("ww6@gmail.com"));
 
         // Checking if the object is null or not
         isProperty = n -> n != null;
         System.out.println("2] Presence of object  :" + isProperty.test(null));
 
         // Validating password strength
         isProperty = n -> n.toString().length() >= 6;
         System.out.println("3] Strong password     :" + isProperty.test("123456"));
 
         // Phone number validation (10 digits, starts with 7, 8, or 9)
         isProperty = n -> (n.toString().length() == 10)
                 && (n.toString().charAt(0) == '7' || n.toString().charAt(0) == '8' || n.toString().charAt(0) == '9');
         System.out.println("4] Number validation   :" + isProperty.test("9123456789"));
 
         // Checking discount eligibility based on user input amount
         isProperty = n -> (Integer) n >= 1000;
         System.out.println("5] Discount applied    :" + isProperty.test(236));
 
         // Determine if a student has passed the exam based on marks
         isProperty = n -> (Double) n >= 35.00;
         System.out.println("6] Exam passed         :" + isProperty.test(35.67));
     }
 }
 