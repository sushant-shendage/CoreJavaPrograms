
/*
 *- prime number | range | 
 *- reverce the number | palindrom number|range|next
 * 
 * 
 *- fibonacci series | memeber of fibonascii number | next fibonascii number |check fibonascii number
 *- 
 *- bubble sort
 *- 
 *- liner search | binary search
 *- 
 *- nth largest | nth smallest
 *- 
 *-frequency of unique element | duplicate element | unique element |
 *-
 * 
 * 
 */

import java.util.Arrays;

public class AllNumberPrograms {
    public static void main(String[] args) {
        // printHelo();
        // chekPrime(7);
        // chekPrime(10);
        // checkPrimeWithinRange(1, 20);
        // reverseNum(560);
        // palindromNum(101);
        // fibseries(9);
        // isFibSeriesElement(9);

        // function is incomplete
        int arr1[] = { 77, 0, 9, 67, 48, 57, 94, 21, 7, 22, 20 };
        // bubbleSort(arr1);

        
        // binarySearch(arr1, 0);
        
        // squarePatteren(6);
        // rightAngledTriangleVerticalToLeft(6);
        rightAngledTriangleVerticalToRight(6);

    }

    static void printHelo() {
        System.out.println("helo-working");
    }

    static void chekPrime(int num) {
        int i = 2;

        for (; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i == num) {
            System.out.println(num + " is the prime number...!");
        } else {
            System.out.println(num + " is consonant number...!");
        }
    }

    static void checkPrimeWithinRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            chekPrime(i);
        }
        System.out.println("===============================");
    }

    static void reverseNum(int num) {
        int rev = 0;
        for (int i = num; i != 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }

        System.out.println("rev num of " + num + " is " + rev);

    }

    static void palindromNum(int num) {
        int rev = 0;
        for (int i = num; i != 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }

        if (num == rev)
            System.out.println("  num " + num + " is palindrom num");
        else
            System.out.println("  num " + num + " is not palindrom num");

    }

    static void fibseries(int limit) {
        int first = 0, second = 1, sum;
        for (int i = 1; i <= limit; i++) {
            System.out.println(first + " | ");
            sum = first + second;
            first = second;
            second = sum;
        }
    }

    static void isFibSeriesElement(int num) {
        int first = 0, second = 1, sum;

        for (; first <= num;) {

            if (first == num) {
                System.out.println(num + " is fib series element..!");
                break;
            }

            sum = first + second;
            first = second;
            second = sum;

        }

        if (first > num) {
            System.out.println(num + " is not fib series element..!");

        }

    }

    static void bubbleSort(int arr[]) {
        int temp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static int[] bubbleSort2(int arr[]) {
        int temp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    static void linearSearch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (i == num) {
                System.out.println("number " + num + " is present");
                return;
            }
        }
        System.out.println("number " + num + " is not present");
        return;

    }

    static void binarySearch(int arr[], int searchingElement) {
        arr = bubbleSort2(arr);
        int mid, start = 0, end = arr.length - 1;

        while (start < end) {
            mid = (start + end) / 2;

            if (arr[mid] == searchingElement) {
                System.out.println("Element found at " + mid + " th index..!");
                return;
            } else if (searchingElement > arr[mid]) {
                start = mid;
                System.out.println("mid : " + mid);
                System.out.println("searching element to right side..!");

            } else {
                end = mid;
                System.out.println("mid : " + mid);
                System.out.println("searching element to left side..!");

            }

        }

        System.out.println("element is not present..!");

    }

    static void squarePatteren(int size) {
        // for (int i = 1; i <= size; i++) {
        //     for (int j = 1; j <= size; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size; j++)
            System.out.print("* ");

            System.out.println();
        }
        
    }

    static void rightAngledTriangleVerticalToLeft(int rows){
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <=i ; j++) 
        System.out.print("*");
        System.out.println();
}
    }

static void rightAngledTriangleVerticalToRight(int rows){
    for (int i = 1; i <= rows; i++) {

        for (int k =1 ; k <= rows-i; k++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
           System.out.print("*"); 
        }

        System.out.println();
    }
}


}
