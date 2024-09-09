public class VowelsandConsonents{
    
        public static void main(String[] args) {
            String input = "Hello World";
            
        
            input = input.toLowerCase();

            StringBuilder vowels = new StringBuilder();
            StringBuilder consonants = new StringBuilder();
    
          
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
    
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels.append(ch);
                } 
                else if (ch >= 'a' && ch <= 'z') {
                    consonants.append(ch);
                }
            }
    
            System.out.println("Vowels: " + vowels.toString());
            System.out.println("Consonants: " + consonants.toString());
        }
    }
    
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

