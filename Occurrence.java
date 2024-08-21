public class Occurrence {
  public static void main(String[] args) {
      String input = "Hello World";
      char targetChar = 'k';
      int count = findOccurrence(input, targetChar);
      System.out.println("Occurrence of '" + targetChar + "': " + count);
  }
  public static int findOccurrence(String str, char target) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == target) {
              count++;
          }
      }
      
      return count;
  }
}
