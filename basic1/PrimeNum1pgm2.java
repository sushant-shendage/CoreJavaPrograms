//pgm Title:program to check given number is prime or not[approch1-m!]
//imported scanner file
import java.util.Scanner;

public class PrimeNum1pgm2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num=sc.nextInt();//taking number from user
        
        int i;
        //running loop between range 2 to (input_number-1)
        for ( i = 2; i < num; i++) 
        {
            //checking is there any divisor of given number  exist or not
            if (num%i==0) 
            {
                break;
            }
        }

        //checking that loop is iterated (input_number) times
        if (i==num) {
            System.out.println(num+" is prime number..!");
        }
        else
        {
            System.out.println(num+" is NOT a prime number..!");
        }
    }
}
