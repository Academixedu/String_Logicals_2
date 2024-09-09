import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd

    public static void main(String[] args) {
        String a = "Hello World";

       
        Set<Character> b = new HashSet<>();

        
        StringBuilder result = new StringBuilder();
         for (char ch : a.toCharArray()) {
            if (!b.contains(ch)) {
                
                result.append(ch);
                b.add(ch);
            }
        }

        System.out.println("Result: " + result.toString());
    }
}


