public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
  import java.util.*;
public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
public static void main(String[] args) {
        String input = "Hello World";  
        System.out.println("Input: " + input);
        System.out.println("Output: " + removeDuplicates(input));
    }

    
    public static String removeDuplicates(String str) {
        String result = ""; 

        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;

            
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;  
                }
            }
            if (!isDuplicate) {
                result += currentChar;
            }
        }

        return result; 
    }
}
}

