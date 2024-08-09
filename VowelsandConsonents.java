public class VowelsAndConsonants {

    // Method to separate and print vowels and consonants from a string
    public static void printVowelsAndConsonants(String str) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty.");
            return;
        }

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Initialize StringBuilders to store vowels and consonants
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        // Define a set of vowel characters for quick lookup
        String vowelsSet = "aeiou";

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                if (vowelsSet.indexOf(c) != -1) {
                    // It's a vowel
                    vowels.append(c);
                } else {
                    // It's a consonant
                    consonants.append(c);
                }
            }
        }

        // Print the vowels and consonants
        System.out.println("Vowels: " + vowels.toString());
        System.out.println("Consonants: " + consonants.toString());
    }

    // Main method to test the printVowelsAndConsonants method
    public static void main(String[] args) {
        // Test string
        String testString = "Hello World";

        // Separate and print vowels and consonants
        printVowelsAndConsonants(testString);
    }
}
