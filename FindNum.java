import java.util.Scanner;

public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
   public static void main(String args[])
{
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

