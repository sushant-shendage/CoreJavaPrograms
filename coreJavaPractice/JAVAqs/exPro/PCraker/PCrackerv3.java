import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PCrackerv3 {
    // Method to generate and write combinations directly to a file
    public static void generateWords(String prefix, int length, char startingCharacter, BufferedWriter writer) throws IOException {
        // Base case: if the word is of the desired length, write it to the file
        if (prefix.length() == length) {
            writer.write(prefix);
            writer.newLine();
            return;
        }

        // Recursive case: Add each letter to the prefix and call recursively
        for (char c = 'A'; c <= 'Z'; c++) {
            generateWords(prefix + c, length, startingCharacter, writer);
        }
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Desired word length
        System.out.print("Enter the desired word length (up to 10): ");
        int wordLength = scanner.nextInt();

        // Input validation for word length
        if (wordLength < 1 || wordLength > 10) {
            System.out.println("Invalid word length. Please enter a number between 1 and 10.");
            return;
        }

        // Input: Starting character
        System.out.print("Enter the starting character (A-Z): ");
        char startingCharacter = scanner.next().toUpperCase().charAt(0);

        // Input validation for starting character
        if (startingCharacter < 'A' || startingCharacter > 'Z') {
            System.out.println("Invalid starting character. Please enter a character between A and Z.");
            return;
        }

        // Output file to save results
        String fileName = "GeneratedWords.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Generate and write words starting with the specified character
            generateWords(String.valueOf(startingCharacter), wordLength, startingCharacter, writer);
            System.out.println("Words successfully saved to '" + fileName + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
