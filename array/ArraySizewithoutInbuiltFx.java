/**
 * This class provides a method to determine the length of an array
 * without using inbuilt functions like `length`.
 */
public class ArraySizewithoutInbuiltFx {

    /**
     * The main method to test the array length function.
     * @param args Command-line arguments (not used here)
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayLengthFunction(arr));
    }

    /**
     * This method calculates the length of the array without using `length` property.
     * It iterates through the array until an exception occurs (ArrayIndexOutOfBoundsException).
     * 
     * @param arr The integer array whose length is to be determined
     * @return The length of the array
     */
    static int arrayLengthFunction(int arr[]) {
        int i = 0;
        try {
            for (;; i++)
                arr[i] = arr[i]; // Accessing elements until exception occurs
        } finally {
            return i;
        }
    }
}
