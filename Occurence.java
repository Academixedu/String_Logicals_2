public class Occurrence {

    // Method to find the occurrence of a character in a string
    public static int countCharOccurrences(String str, char ch) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Initialize a counter for occurrences
        int count = 0;

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array
        for (char c : charArray) {
            // Increment the counter if the character matches
            if (c == ch) {
                count++;
            }
        }

        // Return the total count
        return count;
    }

    // Main method to test the countCharOccurrences method
    public static void main(String[] args) {
        // Test string
        String testString = "Hello World";

        // Character to search for
        char searchChar = 'l';

        // Find and print the number of occurrences
        int occurrences = countCharOccurrences(testString, searchChar);
        System.out.println("The character '" + searchChar + "' occurs " + occurrences + " times in the string \"" + testString + "\".");
    }
}
