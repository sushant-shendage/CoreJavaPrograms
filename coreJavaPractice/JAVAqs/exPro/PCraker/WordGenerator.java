// import java.util.ArrayList;
// import java.util.List;

// public class PcCrakerCGPT {
//     // Method to generate all combinations
//     public static void generateWords(String prefix, int length, List<String> words) {
//         // Base case: if the word is of the desired length, add it to the list
//         if (prefix.length() == length) {
//             words.add(prefix);
//             return;
//         }

//         // Recursive case: Add each letter to the prefix and call recursively
//         for (char c = 'A'; c <= 'Z'; c++) {
//             generateWords(prefix + c, length, words);
//         }
//     }

//     public static void main(String[] args) {
//         // Input: Desired word length
//         int wordLength = 4; // You can change this value to any desired length

//         // List to store all generated words
//         List<String> words = new ArrayList<>();

//         // Generate all words
//         generateWords("", wordLength, words);

//         // Print the generated words
//         System.out.println("Total Words: " + words.size());
//         for (String word : words) {
//             System.out.println(word);
//         }
//     }
// }




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGenerator {
    // Method to generate all combinations
    public static void generateWords(String prefix, int length, List<String> words) {
        // Base case: if the word is of the desired length, add it to the list
        if (prefix.length() == length) {
            words.add(prefix);
            return;
        }

        // Recursive case: Add each letter to the prefix and call recursively
        for (char c = 'A'; c <= 'Z'; c++) {
            generateWords(prefix + c, length, words);
        }
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Desired word length
        System.out.print("Enter the desired word length: ");
        int wordLength = scanner.nextInt();

        // Input: Starting character
        System.out.print("Enter the starting character (A-Z): ");
        char startingCharacter = scanner.next().toUpperCase().charAt(0);

        if (startingCharacter < 'A' || startingCharacter > 'Z') {
            System.out.println("Invalid starting character. Please enter a character between A and Z.");
            return;
        }

        // List to store all generated words
        List<String> words = new ArrayList<>();

        // Generate words starting with the specified character
        generateWords(String.valueOf(startingCharacter), wordLength, words);

        // Print the generated words
        System.out.println("Total Words: " + words.size());
        for (String word : words) {
            System.out.println(word);
        }
    }
}
