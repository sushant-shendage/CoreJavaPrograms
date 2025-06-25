import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
//-------------------------------------------------------------------------
int arr1[]={3,4,1,2,7,6,5};
System.out.println("Array before swapping : "+Arrays.toString(arr1));
sortArray(arr1);
System.out.println("Array after swapping : "+Arrays.toString(arr1));
//-------------------------------------------------------------------------


    }

    // 1.0]methods to sort elements in an array of integers
    // 1.1]method to sort elements of an integer array
    public static void sortArray(int arr[]) {
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
