import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Use a LinkedHashSet to preserve the order of characters
        Set<Character> charSet = new LinkedHashSet<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Add the character to the set (duplicates will be ignored)
            charSet.add(c);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }

    // Main method to test the removeDuplicates method
    public static void main(String[] args) {
        // Test string
        String testString = "Hello World";

        // Remove duplicates and print the result
        String result = removeDuplicates(testString);
        System.out.println("String after removing duplicates: \"" + result + "\"");
    }
}
