public class FindNum {

  public static void main(String[] args) {
      String input = "Hemanth123";

      for (int i = 0; i < input.length(); i++) {
          char ch = input.charAt(i);
          if (Character.isDigit(ch)) {
              System.out.println(ch);
          }
      }
  }
}
