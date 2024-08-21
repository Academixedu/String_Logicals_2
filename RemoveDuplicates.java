import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            seen.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : seen) {
            sb.append(c);
        }

        return sb.toString();
    }
}
