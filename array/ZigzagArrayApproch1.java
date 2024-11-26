// package javapgms.array;

import java.util.Arrays;

public class ZigzagArrayApproch1 {
    public static void main(String[] args) {
        int arr[]={9,77,67,48,57};
        System.out.println(Arrays.toString(arr));

       for (int i = 0; i < arr.length-1; i++) {
        if (i%2!=0) {
        if (!(arr[i]>arr[i+1])) {
           arr[i]=arr[i]+arr[i+1];
           arr[i+1]=arr[i]-arr[i+1]; 
           arr[i]=arr[i]-arr[i+1]; 

        }
        }else{
            if (!(arr[i]<arr[i+1])) {
                arr[i]=arr[i]+arr[i+1];
                arr[i+1]=arr[i]-arr[i+1]; 
                arr[i]=arr[i]-arr[i+1]; 
     
             }
        }
 
       }
       System.out.println(Arrays.toString(arr));

    }
    
}
