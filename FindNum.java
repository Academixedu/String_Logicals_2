import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNum {

    public static void findNumbers(String str) {
        // Define the regex pattern to find numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        // Print each number found
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String testStr = "Java12Script 2024 Version 5.0";
        
        System.out.println("Numbers found in the string:");
        findNumbers(testStr);
    }
}
