import java.util.HashSet;
public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
  


    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }
}


