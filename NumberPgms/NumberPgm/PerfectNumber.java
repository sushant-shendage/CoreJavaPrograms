// package javapgms.NumberPgms.popularNumPgm;

public class PerfectNumber {
    public static void main(String[] args) {
       // Declare the number to check
       int num = 29; // You can change this to any number you want to check
       int sum = 0; // Variable to hold the sum of the divisors

       // Loop through all numbers from 1 to half of 'num'
       for (int i = 1; i <= num / 2; i++) {
           // Check if 'i' is a divisor of 'num'
           if (num % i == 0) {
               sum += i; // If it is, add it to the sum
           }
       }

       // Check if the sum of the divisors is equal to 'num'
       if (sum == num) {
           System.out.printf("%d is a perfect number!", num);  
       } else {
           System.out.printf("%d is not a perfect number!", num);
       }
    }
    
}
