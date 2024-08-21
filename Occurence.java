import java.util.Scanner;
public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = sc.nextLine();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == str1.charAt(0)) {
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
