import java.util.Arrays;

public class SingleLoopSort {
    public static void main(String[] args) {
        int arr1[] = { 77,9,67,48,57};

        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }//FAILED....
        System.out.println(max);

        int arr2[] = new int[max + 1];
        System.out.println(arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[arr1[i]] != 0) {

                arr2[arr1[i]] += arr1[i];
            } else {
                arr2[arr1[i]] = arr1[i];
            }
        }
        System.out.println("arr2 : " + Arrays.toString(arr2));
        

        int arr3[]=arr2;
        
        
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]!=0 && arr2[i]>0) {
                arr3=modifyArr(arr3, i, arr2[i]);
            }
        }
           
        System.out.println(Arrays.toString(arr3));

        int arr4[]=new int[arr1.length];
        for (int i = 0; i < arr4.length; i++) {
            if (arr3[i]==0) {
                continue;
            }
            arr4[i]=arr3[i];
        }
         System.out.println(Arrays.toString(arr4));
    }
           //                                     7         28
    public static int[] modifyArr(int arr[],int index, int value) {
       
        int arr4[] = new int [ arr.length+(value / index)-1 ] , count = value / index,inIndex=0 ;
       for (int i = 0; i < arr.length; i++) {
         if (arr[i]==value) {
            inIndex=i;
            break;
         }
       }
       for (int i = 0,j=0; i < arr4.length; i++) {
        if (i<inIndex) {
           arr4[i]=arr[j];
           j++;
        }
        else if (i>=inIndex && i<=inIndex+count-1) {
            arr4[i]=index;
        }
        else{
                arr4[i]=arr[j+1];
                j++;
        }
      }
      //System.out.println(Arrays.toString(arr4));

      return arr4;
      
    }

}
