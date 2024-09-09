import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNum{
    // prepare a logic to find out numbers in a string and print them
    // Ex if we take Java12Script
    // output should be like
    // 1
    // 2
    public static void main(String[] args) {
        String input = "Java12Script";
        findNumbers(input);
    }

    public static void findNumbers(String input) {
        // Regular expression to match numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        // Find and print all numbers in the string
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
