import java.util.Arrays;

public class Rotate4 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4,5,6,7,8,9,10,11};


        System.out.println(Arrays.toString(a));
        arrLeftShift2(a);
        System.out.println(Arrays.toString(a));


        arrRightShift2(a);
        System.out.println(Arrays.toString(a));


        arrLeftShift2NTimes(a,2);
        System.out.println(Arrays.toString(a));

        arrRightShift2NTimes(a,2);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(a));
        arrp1lp2r(a);
        System.out.println(Arrays.toString(a));
    }

    static void arrLeftShift2(int arr[]) 
    {
        int start = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = start;
    }

    static void arrLeftShift2NTimes(int arr[],int shift)
    {
        for (int i = 1; i <= shift; i++) {
            arrLeftShift2(arr);
        }
    }

    static void arrRightShift2(int arr[]) 
    {
        int end = arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = end;
    }

    static void arrRightShift2NTimes(int arr[],int shift)
    {
        for (int i = 1; i <= shift; i++) {
            arrRightShift2(arr);
        }
    }

    static void arrp1lp2r(int arr[])
    {
       if (arr.length%2==0) 
       {
        int lsArr[]=new int[arr.length/2];
        int rsArr[]=new int[arr.length/2];
        

        for (int i = 0; i < lsArr.length; i++) {
            lsArr[i]=arr[i];
        }
        
        
        for (int i = arr.length/2,j=0; i < arr.length; i++,j++) {
            rsArr[j]=arr[i];
        }
        
        arrLeftShift2(lsArr);
        arrRightShift2(rsArr);
        // System.out.println(Arrays.toString(lsArr));
        // System.out.println(Arrays.toString(rsArr));

        for (int i = 0,j=0; i < arr.length; i++) {
            if (i<arr.length/2) {
                arr[i]=lsArr[i];
            } else {
                arr[i]=rsArr[j];
                j++;  
            }
        }
        
       }
       else
       {
        System.out.println("Odd sized array");
       }
    }

}
