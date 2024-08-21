import java.util.Scanner;

public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    System.out.println("enter a sentence");
    String a=s.nextLine();
    StringBuilder b = new StringBuilder();

    for(int i=0;i<a.length();i++){
      char ch=a.charAt(i);
      if(b.indexOf(String.valueOf(ch))==-1){
        b.append(ch);

      }
    }
    System.out.println(b);

    }

}