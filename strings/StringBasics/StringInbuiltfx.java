public class StringInbuiltfx {

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";
        String str3 = "  Trim this string  ";
        String numberStr = "12345"; // Example string representing a number

        // 1. charAt(int index) - Returns the character at the specified index.
        System.out.println("1. Character at index 7 in str1: " + str1.charAt(7));

        // 2. compareTo(String anotherString) - Compares two strings lexicographically.
        System.out.println("2. Comparing str1 and str2: " + str1.compareTo(str2));

        // 3. compareToIgnoreCase(String str) - Compares two strings lexicographically, ignoring case.
        System.out.println("3. Comparing str1 and str2 ignoring case: " + str1.compareToIgnoreCase(str2));

        // 4. concat(String str) - Concatenates the specified string to the end of this string.
        System.out.println("4. Concatenating str1 and str2: " + str1.concat(str2));

        // 5. contains(CharSequence s) - Checks if the string contains the specified sequence.
        System.out.println("5. str1 contains 'World': " + str1.contains("World"));

        // 6. endsWith(String suffix) - Checks if the string ends with the specified suffix.
        System.out.println("6. str1 ends with '!' : " + str1.endsWith("!"));

        // 7. equals(Object anObject) - Compares the string to the specified object for equality.
        System.out.println("7. str1 equals str2: " + str1.equals(str2));

        // 8. equalsIgnoreCase(String anotherString) - Compares strings for equality, ignoring case.
        System.out.println("8. str1 equalsIgnoreCase 'hello, world!': " + str1.equalsIgnoreCase("hello, world!"));

        // 9. format(String format, Object... args) - Formats a string using the given format and arguments.
        String formatted = String.format("Formatted number: %.2f", 123.45678);
        System.out.println("9. " + formatted);

        // 10. indexOf(int ch) - Returns the index of the first occurrence of the specified character.
        System.out.println("10. Index of 'W' in str1: " + str1.indexOf('W'));

        // 11. indexOf(String str, int fromIndex) - Returns the index of the first occurrence of the specified substring, starting from a given index.
        System.out.println("11. Index of 'l' after index 3 in str1: " + str1.indexOf('l', 3));

        // 12. isEmpty() - Checks if the string is empty.
        System.out.println("12. Is str1 empty: " + str1.isEmpty());

        // 13. lastIndexOf(int ch) - Returns the index of the last occurrence of the specified character.
        System.out.println("13. Last index of 'o' in str1: " + str1.lastIndexOf('o'));

        // 14. length() - Returns the length of the string.
        System.out.println("14. Length of str1: " + str1.length());

        // 15. replace(char oldChar, char newChar) - Replaces all occurrences of a character with another character.
        System.out.println("15. Replacing 'l' with 'p' in str1: " + str1.replace('l', 'p'));

        // 16. replace(CharSequence target, CharSequence replacement) - Replaces all occurrences of a target sequence with another sequence.
        System.out.println("16. Replacing 'World' with 'Universe' in str1: " + str1.replace("World", "Universe"));

        // 17. split(String regex) - Splits the string around matches of the given regular expression.
        String[] words = str1.split(" ");
        System.out.println("17. Splitting str1:");
        for (String word : words) {
            System.out.println("   - " + word);
        }

        // 18. startsWith(String prefix) - Checks if the string starts with the specified prefix.
        System.out.println("18. str1 starts with 'Hello': " + str1.startsWith("Hello"));

        // 19. substring(int beginIndex) - Returns a new string that is a substring starting from the specified index.
        System.out.println("19. Substring of str1 from index 7: " + str1.substring(7));

        // 20. substring(int beginIndex, int endIndex) - Returns a new string that is a substring from the specified start index to the end index.
        System.out.println("20. Substring of str1 from index 0 to 5: " + str1.substring(0, 5));

        // 21. toCharArray() - Converts the string to a character array.
        System.out.println("21. str1 as character array:");
        for (char c : str1.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 22. toLowerCase() - Converts the string to lowercase.
        System.out.println("22. str1 in lowercase: " + str1.toLowerCase());

        // 23. toUpperCase() - Converts the string to uppercase.
        System.out.println("23. str1 in uppercase: " + str1.toUpperCase());

        // 24. trim() - Removes leading and trailing spaces from the string.
        System.out.println("24. Trimming str3: '" + str3.trim() + "'");

        // 25. valueOf(int i) - Converts the given value to a string representation.
        int number = 42;
        System.out.println("25. Value of number: " + String.valueOf(number));

        // 26. join(CharSequence delimiter, CharSequence... elements) - Joins multiple strings with the specified delimiter.
        String joinedString = String.join("-", "Java", "Python", "C++");
        System.out.println("26. Joined string: " + joinedString);

        // 27. parseInt(String s) - Parses the string as a signed decimal integer.
        int parsedNumber = Integer.parseInt(numberStr);
        System.out.println("27. Parsing '12345' to an integer: " + parsedNumber);
    }
}
