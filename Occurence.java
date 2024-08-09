import java.util.Scanner;

public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter sentence");
    String s= sc.nextLine();
    System.out.println("Enter a character to find:");
    char ch = sc.next().charAt(0);
    int count=0;
    for(char i:s.toCharArray())
    {
      if(i==ch){
        count++;
      }
    }
    System.out.println(count);
    }

    
  } 

