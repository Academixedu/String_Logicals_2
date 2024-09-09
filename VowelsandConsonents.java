public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String


    
    public static void separateVowelsAndConsonants(String inputString) {
       
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        
        inputString = inputString.toLowerCase();

        
        for (char ch : inputString.toCharArray()) {
           
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

    
    public static void main(String[] args) {
       
        String inputString = "Hello World";
        
       
        separateVowelsAndConsonants(inputString);
    }
}


