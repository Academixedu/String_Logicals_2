public class VowelsandConsonents {
    public static void main(String[] args) {
        // Input string
        String str = "Hello World";
        
      
        String vowels = "";
        String consonants = "";

       
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

          
            if ("AEIOUaeiou".indexOf(currentChar) != -1) {
                vowels += currentChar;
            } 
       
            else if (Character.isLetter(currentChar)) {
                consonants += currentChar;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
