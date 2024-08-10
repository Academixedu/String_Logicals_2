public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2

  public static void main(String[] args) {
    String input = "Java12Script";
    findNumbersInString(input); 
}
public static void findNumbersInString(String str) {
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i); 
        if (c >= '0' && c <= '9') {
            // 0
            // 9
            System.out.println(c);
        }
    }
}
}
