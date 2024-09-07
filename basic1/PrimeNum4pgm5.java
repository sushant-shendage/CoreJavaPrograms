
//pgm Title:program to check given number is prime or not[approch4-m!]
//imported scanner file
import java.util.Scanner;

public class PrimeNum4pgm5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();// taking number from user

        int i = 0;
        // running loop between range 2 to (input_number-1)
        for (i = 2; i < num; i++) {

            // checking is there any divisor of given number exist or not
            if (num % i == 0) {
                System.out.println(num + " is NOT a prime number ");
                return;
            }
        }
        System.out.println(num + " is a prime number ");
    }
}
