import java.util.*;
public class RemoveDuplicates {
  // Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
    public static void main(String[] args) {
        String s = "Hello World";

        String sr = removeDuplicateCharacters(s);
        System.out.println(" after removing duplicates: " + sr);
    }
    public static String removeDuplicateCharacters(String str) {
        
        LinkedHashSet<Character> lh = new LinkedHashSet<>();
      
        for (int i = 0; i < str.length(); i++) {
            lh.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : lh) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}


