// package javapgms.array;

import java.util.Arrays;

public class ReverceEleInArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        System.out.println(" arr :"+Arrays.toString(arr));

        for (int i = 0,j=arr.length-1; i < arr.length/2; i++,j--) {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
        }

        System.out.println("rev arr :"+Arrays.toString(arr));
    }
    
}
