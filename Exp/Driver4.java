
import java.util.Scanner;

public class Driver4 {
    public static void main(String[] args) {
 
 for (int i = 1,k=1; i <= 5 ; i++) {
    for (int j = 1; j <=i; j++,k++) {

        System.out.printf(" %2d",j%5-1);
        
    }
    System.out.println();
 }
        

    }

    static boolean ispalindrom(int number) {
        int rev = 0;
        for (int i = number; i != 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }
        return rev == number;
    }

    static int nextPalindrom(int number) {
        int i;
        for (i = number + 1; !ispalindrom(i); i++) {

        }
        return i;
    }
}
