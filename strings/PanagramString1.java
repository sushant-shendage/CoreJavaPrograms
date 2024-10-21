import java.util.Arrays;

/**
 * Title: Pangram String Checker
 * 
 * Description:
 * This program checks if a given string is a pangram, which means it contains
 * every letter of the English alphabet at least once. The program converts the
 * input string to lowercase, sorts the characters, and sums the ASCII values 
 * of unique characters to determine if the string is a pangram.
 * 
 * A pangram has a specific sum of ASCII values for all unique letters,
 * which this program checks against a predefined value (2847).
 */
public class PanagramString1 {
    public static void main(String[] args) {
        // Input string to be checked for pangram status
        String inputString = "abcABCDEFdeIJKLlmnopqrstucvwxyz";
        
        // Convert the string to lowercase and then to a character array
        char arr[] = (inputString.toLowerCase()).toCharArray();
        
        // Sort the character array
        Arrays.sort(arr);
        
        // Variable to store the previous character in the sorted array
        char previousChar = arr[0];
        // Variable to hold the sum of unique characters
        int sum = 0;

        // Loop through the sorted character array
        for (int i = 0; i < arr.length; i++) {
            // Skip duplicate characters
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            // Add the ASCII value of the character to the sum
            sum += arr[i] + 0; // Adding 0 to convert char to int
        }

        // Check if the sum of unique character ASCII values equals 2847
        if (sum == 2847) {
            // If it matches, it means the string is a pangram
            sum += (previousChar + 0); // Update sum with the previous character
            System.out.println("Given string is a pangram string.");
        } else {
            // If it doesn't match, the string is not a pangram
            sum += (previousChar + 0); // Update sum with the previous character
            System.out.println("Given string is not a pangram string.");
        }
    }
}
