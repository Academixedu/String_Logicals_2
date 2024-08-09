 import java.util.Scanner;

public class FindNum{
   public static void main(String args[])
{
// Prepare a Logic to findout LongestWord in Sentence
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String a=s.nextLine();
for(char i:a.toCharArray()){
  if(Character.isDigit(i)){
    System.out.println(i);
  }
}
}
}
