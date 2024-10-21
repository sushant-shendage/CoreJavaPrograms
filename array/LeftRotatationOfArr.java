// package javapgms.array;

import java.util.Arrays;

public class LeftRotatationOfArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(" Array :"+Arrays.toString(arr));

        int first=arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;

        System.out.println("rotated Array :"+Arrays.toString(arr));
    }
}
