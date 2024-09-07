
//pgm Title:program to check given number is prime or not[approch5-m!]
//imported scanner file
import java.util.Scanner;

public class PrimeNum6pgm7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();// taking number from user

         if (num==1) {
            System.out.println(num +" is NOT a prime number");
            return;
         }
        // running loop between range 2 to (input_number-1)
        for (int i = 2; i <= num/2; i++) {
             if ( num%i==0) {
                System.out.println(num+" is NOT a prime number");
                return;
             }
        }
        System.out.println(num+" is a prime number");
    }
}
