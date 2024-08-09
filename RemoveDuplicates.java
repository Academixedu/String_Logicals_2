import java.util.Scanner;
public class RemoveDuplicates 
{
  // Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex: Hello World should be printed as Helo Wrd
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sentence:");
    String s = sc.nextLine();
    String result = "";
    for (int i = 0; i < s.length(); i++) 
    {
      char ch = s.charAt(i);
      if (result.indexOf(ch) == -1) 
      {
        result += ch;
      }
    }
      System.out.println(result);
  }
}
  

