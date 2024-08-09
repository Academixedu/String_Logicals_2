
    import java.util.HashSet;

public class duplicate{
    public static void main(String[] args) {
        String str = "Hello World";
        String result = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>(); // To track seen characters
        StringBuilder sb = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character has not been seen yet, append it to the StringBuilder
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString(); // Convert StringBuilder to String and return
    }
}


