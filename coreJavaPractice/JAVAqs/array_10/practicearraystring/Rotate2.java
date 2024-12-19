import java.util.Arrays;

public class Rotate2 {
    public static void main(String[] args) {
        int a[]={9,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(a));
        arrLeftRotate(a);
        System.out.println(Arrays.toString(a));
        arrRightRotate(a);
        System.out.println(Arrays.toString(a));
    }
    static void arrLeftRotate(int arr[])
    {
        int start=arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=start;
    }

    static void arrRightRotate(int arr[])
    {
        int end=arr[arr.length-1];

        for (int i = arr.length-1; i > 0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=end;
    }
}
