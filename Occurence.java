 import java.util.Scanner;
public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    System.out.println("enter a sentence");
    String a=s.nextLine();
    System.out.println("enter a character");
    char ch = s.next().charAt(0);
    int count=0;
    for(char i:a.toCharArray())
    {
      if(i==ch){
        count++;
      }
    }
    System.out.println(count);
  }
}
