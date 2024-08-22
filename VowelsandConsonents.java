public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

    public static void main(String[] args) {
        String input = "Hello World";
        printVowelsAndConsonants(input);
    }

    public static void printVowelsAndConsonants(String str) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert character to lowercase for easier comparison
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch);
            }
            // Check if the character is a consonant (i.e., a letter but not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonants.append(ch);
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


