// package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // implenentinf bubbli sort

        int arr[] = { 77, 0, 9, 67, 47, 57, 94, 21, 0, 7, 22, 20 };
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting  : " + Arrays.toString(arr));

    }
}
