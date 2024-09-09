public class VowelsandConsonents{
        public static void main(String[] args) {
            String input = "HelloWorld";
            String vowels = "";
            String consonants = "";
            
            for (char c : input.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') { // Check if character is alphabetic
                    if ("aeiou".indexOf(c) != -1) { // Check if it's a vowel
                        vowels += c;
                    } else {
                        consonants += c;
                    }
                }
            }
    
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }
    

