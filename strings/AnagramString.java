/**
 * Title: Anagram String Checker
 * 
 * Description:
 * This program checks if two given strings are anagrams of each other.
 * Anagrams are strings that can be rearranged to form each other, meaning 
 * they contain the same characters in the same frequency. The program 
 * converts both strings to lowercase, checks their lengths, and calculates 
 * the difference in ASCII values of corresponding characters to determine 
 * if they are anagrams. If the total difference is zero, the strings are 
 * considered anagrams.
 */
public class AnagramString {
    public static void main(String[] args) {
        // Input strings to be checked for anagram status
        String firstInputString = "Anab", secondInputString = "ana";

        // Convert both strings to lowercase for case-insensitive comparison
        firstInputString = firstInputString.toLowerCase();
        secondInputString = secondInputString.toLowerCase();

        // Flag to track character differences
        int flag = 0;

        // Check if the lengths of the strings are different
        if (firstInputString.length() != secondInputString.length()) {
            System.out.println("Given strings are NOT 'Anagram strings' ..!");
            return; // Exit the program if lengths differ
        } else {
            // Calculate the total difference in ASCII values of corresponding characters
            for (int i = 0; i < firstInputString.length(); i++) {
                flag += (firstInputString.charAt(i) - secondInputString.charAt(i));
            }
        }
        
        // If the total difference is zero, the strings are anagrams
        if (flag == 0) {
            System.out.println("Given strings are 'Anagram strings'..!");
        } else {
            // If the total difference is not zero, the strings are not anagrams
            System.out.println("Given strings are NOT 'Anagram strings'..!");
        }
    }
}
