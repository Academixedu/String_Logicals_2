public class FindNum {
  public static void main(String[] args) {
      String input = "Java12";
       for (int i = 0; i < input.length(); i++) {
          char ch = input.charAt(i);
           if (Character.isDigit(ch)) {
            System.out.println(ch);
          }
      }
  }
}
