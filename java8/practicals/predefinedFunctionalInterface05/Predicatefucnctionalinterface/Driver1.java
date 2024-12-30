package Predicatefucnctionalinterface;
// package javapgms.java8.practicals.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class Driver1 {
    public static void main(String[] args) {
        //write a program to check givn number is even or odd using predefined functional interface
        Predicate <Integer> isOperationNumber=n->n%2==0;
         System.out.println(isOperationNumber.test(6));

         //write a program to check givn number is positive or negative using predefined functional interface
         isOperationNumber=n->n>0;
         System.out.println(isOperationNumber.test(-6));

         //write a program to check given string length is 5 or not
         Predicate <String> isOperationString=n->n.length()==5;
         System.out.println(isOperationString.test("abc"));
        
         //WPT check given is started with h  or not
         isOperationString=n->n.charAt(0)=='A';
         System.out.println(isOperationString.test("Abc"));

        //WPT check given is end with 'A'  or not
         isOperationString=n->n.charAt(n.length()-1)=='H';
         System.out.println(isOperationString.test("AbcH"));

        //string is having j or not
         isOperationString=n->n.contains("j");
         System.out.println(isOperationString.test("AbcH"));

         //number is in the range or not(10,30)
         isOperationNumber=n->n>=10 && n<=30;
         System.out.println(isOperationNumber.test(20));
          
    }
    
}
