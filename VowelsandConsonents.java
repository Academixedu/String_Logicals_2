public class vowels {
        public static void main(String[] args) {
            String str = "Hello World";
            String vowels = findVowels(str);
            String consonants = findConsonants(str);
    
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    
        public static String findVowels(String str) {
            StringBuilder vowels = new StringBuilder();
            String vowelSet = "AEIOUaeiou";
    
            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
    
                // Check if the character is a vowel
                if (vowelSet.indexOf(ch) != -1) {
                    vowels.append(ch);
                }
            }
    
            return vowels.toString();
        }
    
        public static String findConsonants(String str) {
            StringBuilder consonants = new StringBuilder();
            String vowelSet = "AEIOUaeiou";
    
            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
    
                // Check if the character is a consonant (not a vowel and a letter)
                if (Character.isLetter(ch) && vowelSet.indexOf(ch) == -1) {
                    consonants.append(ch);
                }
            }
    
            return consonants.toString();
        }
    }
    

