import java.util.Arrays;

public class Rotate3 {
    public static void main(String[] args) {
        int a[] = { 8, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(a));
        arrLeftShiftNTimes(a,2);
        System.out.println(Arrays.toString(a));
    }

    static void arrLeftShift(int arr[]) {
        int start = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = start;
    }
    static void arrLeftShiftNTimes(int arr[],int shift) {
        for (int i = 0; i < shift; i++) {
            arrLeftShift(arr);
             
        }
    }
}
