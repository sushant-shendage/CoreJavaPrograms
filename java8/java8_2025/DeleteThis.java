import java.util.Scanner;

public class DeleteThis {
    public static void main(String[] args) {

        isPrime(79);

        printReverce(1234);

        palindrom(1215);
        nextPalindrom(100);

        printFibSeries(7);


    }

    static void isPrime(int number) {
        int i;

        // output msg if given negative integer

        if (number < 0) {
            System.out.println("the given number is -ve, please enter +ve integer..!");
            return;
        }

        // check is there any perfect divisor exists between 2 to number-1 range and
        // make desicion

        for (i = 2; i < number || number % i == 0; i++)
            ;

        if (i == number)
            System.out.println("the given number is prime..!");
        else
            System.out.println("the given number is NOT prime..!");
    }

    static void printReverce(int number) {
        int rev = 0;

        for (int i = number; i != 0; rev = rev * 10 + i % 10, i /= 10)
            ;

        System.out.println("The reverce of " + number + "  :  " + rev);
    }

    static void palindrom(int num) {
        int rev = 0;

        for (int i = num; i != 0; rev = rev * 10 + i % 10, i /= 10);

        if (rev == num) {
            System.out.println("the given number is palindrom..!");
        } else {
            System.out.println("the given number is NOT palindrom..!");
        }
    }

    static void printFibSeries(int limit){
        int first=0,second=1,sum;
for (int i=1; i <= limit; i++) {
    System.out.print(first+"|");
    sum=first+second;                                           
    first=second;
    second=sum;
}
    }

    static void nextPalindrom(int number){

        int rev=0;
        for (int i = number; i!=10; i/=10);

    }
}
