import java.util.Arrays;

public class HalfArrLRShift {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8,9};// even sized array
        System.out.println(Arrays.toString(a));

        lrShiftArr(a);
        System.out.println(Arrays.toString(a));
    }

    static void lrShiftArr(int[] arr) {

        int first=arr[0],last=arr[arr.length-1];
        for (int i = 0; i < arr.length/2; i++) {
            
            arr[i]=arr[i+1];
        }
        arr[arr.length/2-1]=first;
        for (int i = arr.length-1; i >=arr.length/2; i--) {
            arr[i]=arr[i-1];
        }
        arr[arr.length/2]=last;
    }
}
