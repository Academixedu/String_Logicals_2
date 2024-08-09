public class VowelsandConsonents{
    public static void main(String[] args) {
        String str = "Hello World";
        String vowels = "";
        String consonants = "";
    
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels += c;
            } else if (c >= 'a' && c <= 'z') {
                consonants += c;
            }
        }
    
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
    }
    
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

