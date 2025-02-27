/**
 * This program prints the unique characters from a given string.
 * A character is considered unique if it appears only once in the string.
 */
public class UniqueCharactersInString {
    
    /**
     * The main method that executes the program.
     * It identifies and prints the unique characters in the given string.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Input string
        String str = "aceczcdbfcdabcee";
        String ansStr = ""; // Stores unique characters

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Compare the current character with every other character
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    count++;

                    // If the character appears more than once, stop checking further
                    if (count == 2) {
                        break;
                    }
                }
            }

            // If character appears only once, add it to the result string
            if (count == 1) {
                ansStr += str.charAt(i);
            }
        }

        // Print unique characters
        System.out.println(ansStr);
    }
}
