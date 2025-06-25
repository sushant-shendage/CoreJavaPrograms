// package codingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,2,2,2,2,3,4,5,5,6,6,6};
        System.out.println("arr : "+arr);

        ArrayList al= new ArrayList<>(Arrays.asList(1,2,3,1,2,3,4,5));
        System.out.println("al : "+al);

        HashSet hs= new HashSet<>(al);
        System.out.println("hs :"+hs);

        Object arr2[]=hs.toArray();
        System.out.println("arr2 : "+Arrays.toString(arr2));


       //print unique elemem=nts of an array

       int arr3[]={4,5,6,1,2,3};

       //sort elements of an array
System.out.println(Arrays.toString(arr2));
       for (int j = 0; j < arr3.length-1; j++) {
        for (int i = 0; i < arr3.length-1-j; i++) {

        //condition for swaping
        if(arr3[i]>arr3[i+1])
        {
            int temp=arr3[i];
            arr3[i]=arr3[i+1];
            arr3[i+1]=temp;
        }
       }
       }
System.out.println("After swapping : "+Arrays.toString(arr3));



  
 
 
    }
}
