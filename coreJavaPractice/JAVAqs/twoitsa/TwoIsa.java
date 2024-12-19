// package twoitsa;

import java.util.Arrays;

public class TwoIsa {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,1,1};
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("max ::"+max);

        int modifyArr[]=new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            modifyArr[arr[i]]=arr[i];
        }

        int modifyArr2[]=new int[arr.length];
        System.out.println("after ::"+Arrays.toString(modifyArr2));

        for (int i = 0,j=0; i < modifyArr.length; i++) {
            if (modifyArr[i]!=0) {
                modifyArr2[j]=modifyArr[i];
                j++;
            }
        }

        System.out.println("after ::"+Arrays.toString(modifyArr2));

       
       
        
        System.out.println("\nprogram execution completed..!");
    }
     
    

     


  //18 sept, 24
}
