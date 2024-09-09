public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
    public static void main(String[] args) {
        String s = "Hello World";
        separateVowelsAndConsonants(s);
    }
    public static void separateVowelsAndConsonants(String str) {
        str = str.toLowerCase();

        String vowels = "";
        String consonants = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                vowels += ch;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                consonants += ch;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


