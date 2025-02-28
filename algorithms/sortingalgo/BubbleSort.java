// package javapgms.algorithms.sortingalgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={77,9,67,48,57};

        System.out.println(Arrays.toString(arr));

        for ( int j = 1 ; j < arr.length-j   ; j++ ) 
        for ( int i = 0 ; i < arr.length - 1 ; i++ ) {
                if ( arr[ i ] > arr[ i + 1 ] ) {
                    arr[i  ] = arr[i] ^ arr[i + 1] ;
                    arr[i+1] = arr[i] ^ arr[i + 1] ;
                    arr[i  ] = arr[i] ^ arr[i + 1] ;
                }
        }
        

        System.out.println(Arrays.toString(arr));

    }
}
