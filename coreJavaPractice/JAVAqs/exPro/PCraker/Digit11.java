import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Digit11 {
    // Method to generate all combinations
    public static void generateNumbers(String prefix, int length, List<String> numbers) {
        // Base case: if the number is of the desired length, add it to the list
        if (prefix.length() == length) {
            numbers.add(prefix);
            return;
        }

        // Recursive case: Add each digit (0-9) to the prefix and call recursively
        for (char c = '0'; c <= '9'; c++) {
            generateNumbers(prefix + c, length, numbers);
        }
    }

    public static void main(String[] args) {
        // Input: Desired number length
        int numberLength = 6; // You can change this value to any desired length

        // List to store all generated numbers
        List<String> numbers = new ArrayList<>();

        // Generate all numbers
        generateNumbers("", numberLength, numbers);

        // File path to store results
        String fileName = "GeneratedNumbers.txt";

        // Write results to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write the total number of generated numbers
            writer.write("Total Numbers: " + numbers.size());
            writer.newLine();

            // Write each generated number to the file
            for (String number : numbers) {
                writer.write(number);
                writer.newLine();
            }

            System.out.println("Total Numbers: " + numbers.size());
            System.out.println("Numbers successfully saved to '" + fileName + "'.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
