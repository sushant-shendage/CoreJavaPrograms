import java.util.Arrays;

public class EvenOddHalfLRArrayRotate {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55,66,77};
        halfArrLRShift(a,"RM");

    }
   public static void  halfArrLRShift(int[]arr,String s1)
    {
         
        if(arr.length%2==0)
        {

            System.out.println("Even sized array output :");
            int first=arr[0],last=arr[arr.length-1];
            for ( int i=0,j=arr.length-1;i<arr.length/2+1||j>=arr.length/2;i++,j--) {
                arr[i]=arr[i+1];
                arr[j]=arr[j-1];
                //System.out.println(Arrays.toString(arr));
            }
            arr[arr.length/2-1]=first;
            arr[arr.length/2]=last;

            System.out.println(Arrays.toString(arr));
        }
        else 
        {
           if (s1=="MEE") 
           {
            System.out.println("odd sized array");
            System.out.println("Middle Element Excluded");

            int first=arr[0],last=arr[arr.length-1];
            for ( int i=0,j=arr.length-1;i<=arr.length/2||j>arr.length/2;i++,j--) {
                arr[i]=arr[i+1];
                arr[j]=arr[j-1];
               // System.out.println(Arrays.toString(arr));
            }
            arr[arr.length/2-1]=first;
            arr[arr.length/2+1]=last;

            System.out.println(Arrays.toString(arr));            
           } 
           else if(s1=="LM")
            {
            System.out.println("LM-middle element included in first half");
            System.out.println("odd sized hgffkhgv,j array");
            System.out.println(Arrays.toString(arr));  

            int first=arr[0],last=arr[arr.length-1];
            for ( int i=0,j=arr.length-1;i<=arr.length/2||j>arr.length/2;i++,j--) {
                arr[i]=arr[i+1];
                arr[j]=arr[j-1];
               // System.out.println(Arrays.toString(arr));
            }
            arr[arr.length/2]=first;
            arr[arr.length/2+1]=last;

            System.out.println(Arrays.toString(arr));          
           }
           else
           {
            System.out.println("middle element included in second half");

             
            System.out.println("odd sized hgffkhgv,j array");
            System.out.println(Arrays.toString(arr));  

            int first=arr[0],last=arr[arr.length-1];
            for ( int i=0,j=arr.length-1;i<arr.length/2||j>=arr.length/2;i++,j--) {
                arr[i]=arr[i+1];
                arr[j]=arr[j-1];
               // System.out.println(Arrays.toString(arr));
            }
            arr[arr.length/2-1]=first;
            arr[arr.length/2]=last;

            System.out.println(Arrays.toString(arr));        
           }
        }

    }
}
