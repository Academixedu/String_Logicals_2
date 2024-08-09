public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
    public static void main(String[] args) {
        String input= "Hello World";
        findVC(input);
    }

    public static void findVC(String input) {
        String vowels = "";
        String consonants = "";
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (isVowel(currentChar)) {
                    vowels =vowels+ currentChar;
                } else {
                    consonants =consonants+ currentChar;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


