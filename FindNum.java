public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void main(String[] args) {
    String str = "Java12Script";
    for (char ch : str.toCharArray()) {
        if (Character.isDigit(ch)) {
            System.out.println(ch);
        }
    }
}

}
