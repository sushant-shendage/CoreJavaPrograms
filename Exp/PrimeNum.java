// package javapgms.Exp;

/* 
 What is prime number?
 'n' is prime number only if n is only divisible by 1 and n only.

 Algorithm:
 1)take number 'n' from user
 2)between range 2 to n-1 check is there any perfect divisor
    if dperfect divisor
      exists   -->print given number is not prime number
      otherwise-->print given number is  consecutive number
*/

//implenentation of algorith
public class PrimeNum {
    public static void main(String[] args) {

        // step 1: number from user(using hardcode)
        int num = 1, i;

        // step 2 : checking is there any perfect divisor between 2 to (num-1)
        for (i = 2; i < num; i++) {

            if (num % i == 0) {

                break;
            }
        }
        if (i != num) {
            System.out.println("the number is not prime number");
        } else {

            System.out.println("the number is prime number");
        }

    }

}
