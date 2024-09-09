import java.util.Scanner;

public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    for(int i=0; i<str.length(); i++){
      char ch=str.charAt(i);
      if(Character.isDigit(ch)){
        System.out.println(ch);
      }
    }
  }
}
