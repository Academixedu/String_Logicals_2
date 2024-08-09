 public class Occurence {
    public static void main(String[] args) {
        String str = "Hello World";
        char targetChar = 'l'; // The character to check for occurrences
        int count = findOccurrence(str, targetChar);
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
    }

    public static int findOccurrence(String str, char targetChar) {
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++; // Increment count if the character matches targetChar
            }
        }

        return count;
    }
}
