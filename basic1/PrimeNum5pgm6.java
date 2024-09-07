
//pgm Title:program to check given number is prime or not[approch5-m!]
//imported scanner file
import java.util.Scanner;

public class PrimeNum5pgm6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();// taking number from user

        int count = 0;
        // running loop between range 2 to (input_number-1)
        for (int i = 2; i < num; i++) {
            System.out.println(num % i);
            if (num == 2) {
                break;
            }
            // checking is there any divisor of given number exist or not
            if (num % i == 0) {
                count++;
            }
            if (count == 1) {
                System.out.println(num + " is  NOT prime number ");

                return;
            }
        }
        if (num == 1) {
            System.out.println(num + " is  NOT prime number ");
            return;
        }
        System.out.println(num + " is a prime number ");
    }
}
