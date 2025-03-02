// package javapgms.algorithms.sortingalgo;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = { 77, 9, 67, 48, 57, 94, 21, 7, 22, 20 };
        System.out.println(Arrays.toString(arr));
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] bubbleSort(int arr[]) {

        for (int j = 1; j < arr.length - 1; j++)
            for (int i = 0; i < arr.length - j; i++)
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
        return arr;
    }
}
