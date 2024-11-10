// Title: Binary search without sorting an array
public class LinearSearchWithoutSortingArray {

    public static void main(String[] args) {
        // Initialize an array with one element for simplicity
        int array[] = { 100 };
        int maxElement = 0;

        // Check if the array has only one element
        if (array.length == 1) {
            // If there's only one element, it's the maximum by default
            maxElement = array[0];
        } else {
            // This loop finds the maximum element without sorting the array
            // Initialize two pointers: 'leftIndex' starts from the beginning, 'rightIndex' from the end
            for (int leftIndex = 0, rightIndex = array.length - 1;;) {

                // If the element at 'leftIndex' is greater than the element at 'rightIndex'
                if (array[leftIndex] > array[rightIndex]) {
                    rightIndex--; // Move the right pointer left
                }
                // If both pointers have the same value
                else if (array[leftIndex] == array[rightIndex]) {
                    leftIndex++; // Move the left pointer right
                    rightIndex--; // Move the right pointer left
                }
                // If the element at 'leftIndex' is less than the element at 'rightIndex'
                else if (array[leftIndex] < array[rightIndex]) {
                    leftIndex++; // Move the left pointer right
                }

                // When the pointers meet, the maximum value is found
                if (leftIndex == rightIndex) {
                    maxElement = array[leftIndex]; // Set the max value to the element at the meeting point
                    break; // Exit the loop
                }
            }
        }

        // Print the maximum value found
        System.out.println("Max element: " + maxElement);
    }
}

/*
Time Complexity Analysis:
- Best Case: O(1) when the array has only one element.
- General Case: O(n) as it involves a linear scan of the array with two pointers.
Space Complexity: O(1) as no additional space is used; the operation is done in place.
*/
