// package javapgms.array;

import java.util.Arrays;

public class StroingElementAlternativelyToThirdArr {

   public static void main(String[] args) {
    int arr1[] = { 1, 2, 3 };

    int arr2[] = { 5, 6, 7};

    int ansArr[]=new int[arr1.length+arr2.length];

  if(arr1.length<arr2.length){
    for(int i = 0,j=0;i< ansArr.length;i+=2,j++)
        {
    
            if (i <(2 * arr1.length)) {
                ansArr[i] = arr1[j];
                ansArr[i+1] = arr2[j];
            }
            else{
                ansArr[i]=arr2[j];
                i--;
            }
        }
        System.out.println("ans ::"+Arrays.toString(ansArr));
    
  }
  else if(arr1.length>arr2.length){
    for(int i = 0,j=0;i< ansArr.length;i+=2,j++)
        {
    
            if (i <(2 * arr2.length)) {
                ansArr[i] = arr1[j];
                ansArr[i+1] = arr2[j];
            }
            else{
                ansArr[i]=arr1[j];
                i--;
            }
    
        }
        System.out.println("ans ::"+Arrays.toString(ansArr));
    
  }
  else {
    for(int i = 0,j=0;i< ansArr.length;i+=2,j++)
        {
    
           
                ansArr[i] = arr1[j];
                ansArr[i+1] = arr2[j];
           
    
        }
        System.out.println("ans ::"+Arrays.toString(ansArr));
    
  }
   }
}
