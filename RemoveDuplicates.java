import java.util.Scanner;
public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = "";
    for (int i = 0; i < str.length(); i++) {
      if (str1.indexOf(str.charAt(i)) == -1) {
        str1 = str1 + str.charAt(i);
      }
    }
    System.out.println(str1);
    sc.close();
  }
}
