//pgm Title:program to check given number is prime or not[approch2-m!]
//imported scanner file
import java.util.Scanner;

public class PrimeNum2pgm2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num=sc.nextInt();//taking number from user
        
        int count=0;
        //running loop between range 2 to (input_number-1)
        for (int i = 2; i < num; i++) 
        {
            
            //checking is there any divisor of given number  exist or not
            if (num%i==0) 
            {
                 count++;
            }
            if (count==1) {
                break;
            }
        }

        //checking that loop is iterated (input_number) times
        if (count==0) {
            System.out.println(num+" is prime number..!");
        }
        else
        {
            System.out.println(num+" is NOT a prime number..!");
        }
    }
}
