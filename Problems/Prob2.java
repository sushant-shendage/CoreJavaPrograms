// package javapgms.Problems;

/**
 * This class provides a solution to the Two Sum problem.
 * Given an array and a target number, it finds combinations of  two numbers in the array whose sum equals the target.
 */
public class Prob2 {
    public static void main(String[] args) {
        int arr[] = { -1,9,2, 0,6,5, 11, 15,9,10,12,100 };
        printCombination(arr, 180); // Find and print the pair that sums to the target
    }

    /**
     * Finds and prints the first pair of numbers in the given array whose sum equals the target value.
     * If no such pair exists, it prints a message indicating that no combination is available.
     *
     * @param arr    The input array of integers.
     * @param target The target sum to be achieved by adding two numbers from the array.
     */
    static void printCombination(int arr[], int target) {
        int i,count=0;
        for (i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if ((arr[i] + arr[j]) == target) {
                    count++;
                    System.out.printf("(%d, %d)", arr[i], arr[j]);
                    continue; // Exit after finding the first valid pair
                }
            
        

        // If no pair is found, print a message
        if (count==0)
        System.out.println("No combination is available..!");
    }
}
