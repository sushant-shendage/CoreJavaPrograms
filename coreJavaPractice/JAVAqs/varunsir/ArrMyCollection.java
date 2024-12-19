import java.util.Arrays;

public class ArrMyCollection {
    public static void main(String[] args) {
int a[]={1};
        printArr(a);
        a=addArr(a,7);
        printArr(a);
    }

    static void printArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    static int[] addArr(int arr[],int increseSize) {
        int arr2[]=new int[arr.length+increseSize];
        return arr2;
    }

}
