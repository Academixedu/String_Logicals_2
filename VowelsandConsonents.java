public class VowelsandConsonents{
    public class VowelsandConsonants {
        public static void main(String[] args) {
            String s = "Hello World";
            String vowels = "";
            String consonants = "";
            
            for (char c : s.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') {  
                    if ("aeiou".indexOf(c) != -1) {
                        vowels += c + " ";  
                    } else {
                        consonants += c + " ";  
                    }
                }
            }
            
            System.out.println("Vowels: " + vowels.trim());
            System.out.println("Consonants: " + consonants.trim());
        }
    }
    
}
