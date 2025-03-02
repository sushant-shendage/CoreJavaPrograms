/**
 * This class demonstrates two searching algorithms: Linear Search and Binary Search.
 */
public class SearchAlgorithms {
    
    /**
     * Main method to execute the search functions.
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Sample sorted array
        
        binarySearch(arr, 9); // Searching for 9 using binary search
        linearSearch(arr, 8); // Searching for 8 using linear search
    }

    /**
     * Implements Linear Search Algorithm
     * @param arr The array to search in
     * @param target The element to find
     */
    static void linearSearch(int arr[], int target) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) { // If target is found
                System.out.printf("\n Element found at index %d", i);
                return; // Exit method once found
            }
        }
        System.out.println("\nElement not found"); // If element is not in array
    }

    /**
     * Implements Binary Search Algorithm (works only on sorted arrays)
     * @param arr The sorted array to search in
     * @param num The element to find
     */
    static void binarySearch(int arr[], int num) {
        int start = 0; // Initial left boundary of search space
        int end = arr.length - 1; // Initial right boundary
        int mid; // Variable to hold middle index

        while (start <= end) { // Continue searching while search space is valid
            mid = (start + end) / 2; // Calculate middle index

            if (arr[mid] < num) // If the target is greater, search right half
                start = mid + 1;
            else if (arr[mid] > num) // If the target is smaller, search left half
                end = mid - 1;
            else { // If target is found at mid index
                System.out.printf("\n Element found at index %d", mid);
                return; // Exit method once found
            }
        }
        System.out.println("\nElement not found"); // If element is not in array
    }
}
