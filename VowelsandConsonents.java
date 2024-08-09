import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        input = input.toLowerCase();
        String vowelString = "aeiou";
        for (char ch : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (vowelString.indexOf(ch) >= 0) {
                    vowels.append(ch).append(" ");
                } else {
                    consonants.append(ch).append(" ");
                }
            }
        }
        // Print the results
        System.out.println("Vowels: " + vowels.toString().trim());
        System.out.println("Consonants: " + consonants.toString().trim());
        scanner.close();
    }
}
