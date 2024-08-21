public class RemoveDuplicates {
  public static void main(String[] args) {
      String input = "Hello Java";
      System.out.println(removeDuplicates(input));
  }
  
  public static String removeDuplicates(String str) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (sb.indexOf(String.valueOf(ch)) == -1) {
              sb.append(ch);
          }
      }
      
      return sb.toString();
  }
}
