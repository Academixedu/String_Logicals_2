import java.util.Scanner;

public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your String "); 
    String s = sc.nextLine();
  String temp="";
    for(int i=0;i<s.length();i++){
      char temp1 = s.charAt(i);

      if (temp.indexOf(temp1) == -1) {
        temp=temp+temp1;
      }
    }
      System.out.println(" string is "+temp);



      }
    }


