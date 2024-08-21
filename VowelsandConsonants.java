public class VowelsandConsonants {
    public static void main(String[] args) {
        String input = "Hello Java";
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if ("aeiou".indexOf(ch) != -1) {
                vowels.append(ch);
            } 
         
            else if (Character.isLetter(ch)) {
                consonants.append(ch);
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
