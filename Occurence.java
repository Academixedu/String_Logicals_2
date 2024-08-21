import java.util.Scanner;
public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String s = sc.nextLine();

    System.out.println("Enter a Character :");
    char word = sc.next().charAt(0);

    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == word) // If the current character matches the character to search for, increment the counter
      {
        count++;
      }
    }
    System.out.println("The Occurence of " + word + " appears " + count+ " times in the String");
  }
}
