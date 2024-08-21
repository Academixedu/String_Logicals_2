public class VowelsAndConsonants {

    public static void main(String[] args) {
        String input = "Hello World";
        printVowelsAndConsonants(input);
    }

    public static void printVowelsAndConsonants(String input) {
        String vowels = "";
        String consonants = "";
        
        input = input.toLowerCase();
        
        for (char ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants += ch;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
