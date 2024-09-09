import java.util.Scanner;

public class RemoveDuplicates{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = sc.nextLine();
    String result = removeDuplicates(s);
    System.out.println("String after removing duplicates: " + result);
  }
  public static String removeDuplicates(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (sb.indexOf(String.valueOf(c)) == -1) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
