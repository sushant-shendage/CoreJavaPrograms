// package dynamicInputsFromUser.usingScanner;

import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        int dynamicIntegerInput=new Scanner(System.in).nextInt();
        System.out.println("You have entered number :"+ dynamicIntegerInput);
        System.out.println("You have entered number :"+((Object)dynamicIntegerInput).getClass().getSimpleName());
    }
}
