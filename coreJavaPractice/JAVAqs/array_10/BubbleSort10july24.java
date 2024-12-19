import java.util.Arrays;

public class BubbleSort10july24 {
    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < args.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
