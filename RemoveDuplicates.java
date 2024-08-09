import java.util.Scanner;
public class RemoveDuplicates{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =sc.nextLine();
        String word="";
        for (int i = 0; i < str.length(); i++) {
          if(!word.contains(String.valueOf(str.charAt(i)))) {
              word += String.valueOf(str.charAt(i));
          }
      }
      System.out.println(word);  
  }
}
