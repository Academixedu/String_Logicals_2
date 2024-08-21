public class Occurence {

  public static void main(String[] args) {
      String input = "Hello World";
      char target = 'l';
      int count = 0;

      for (int i = 0; i < input.length(); i++) {
          if (input.charAt(i) == target) {
              count++;
          }
      }

      System.out.println("The character '" + target + "' occurs " + count + " times in the string.");
  }
}
