public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
    public static void main(String[] args) {
        String input = "Java12Script";  // Example input
        findAndPrintNumbers(input);
    }

    public static void findAndPrintNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println(ch);
            }
        }
    }
}


