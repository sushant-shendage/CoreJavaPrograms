
import java.util.Arrays;

public class July24_14_01 {

    public static void main(String[] args) {
        int a[]={8,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        arrLeftRotate(a);
        System.out.println(Arrays.toString(a));
        arrRightRotate(a);
        System.out.println(Arrays.toString(a));
    }
    static void arrLeftRotate(int arr[])
    {
        System.out.println("left rotate");
       int  start=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=start;

        
    }
    static void arrRightRotate(int arr[])
    {
        System.out.println("right rotate");
       int  end=arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=end;

        
    }
}
