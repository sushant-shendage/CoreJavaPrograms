 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PcCrakerDigits {
    // Method to generate and write combinations directly to a file
    public static void generateNumbers(String prefix, int length, char startingDigit, BufferedWriter writer) throws IOException {
        // Base case: if the number is of the desired length, write it to the file
        if (prefix.length() == length) {
            writer.write(prefix);
            writer.newLine();
            return;
        }

        // Recursive case: Add each digit to the prefix and call recursively
        for (char c = '0'; c <= '9'; c++) {
            generateNumbers(prefix + c, length, startingDigit, writer);
        }
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Desired word length
        System.out.print("Enter the desired number length: ");
        int numberLength = scanner.nextInt();

        // Input validation for number length
        if (numberLength < 1 || numberLength > 10) {
            System.out.println("Invalid number length. Please enter a value between 1 and 10.");
            return;
        }

        // Input: Starting digit
        System.out.print("Enter the starting digit (0-9): ");
        char startingDigit = scanner.next().charAt(0);

        // Input validation for starting digit
        if (startingDigit < '0' || startingDigit > '9') {
            System.out.println("Invalid starting digit. Please enter a digit between 0 and 9.");
            return;
        }

        // Output file to save results
        String fileName = "GeneratedNumbers.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Generate and write numbers starting with the specified digit
            generateNumbers(String.valueOf(startingDigit), numberLength, startingDigit, writer);
            System.out.println("Numbers successfully saved to '" + fileName + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
