import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates{
  // Prepare a Logic to find out and Remove Duplicate char in a String
    // Ex Hello World should be printed as Helo Wrd
     public static String removeDuplicates(String inputString) {
        
        Set<Character> charSet = new LinkedHashSet<>();

        
        for (char ch : inputString.toCharArray()) {
       
            charSet.add(ch);
        }

       
        StringBuilder result = new StringBuilder();
        for (char ch : charSet) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        String inputString = "Hello World";
        
        
        String result = removeDuplicates(inputString);
        
       
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + result);
    }
}

