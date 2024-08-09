import java.util.Scanner;

public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter your sentence");
    String sentence=sc.nextLine();
    String result="";
    for(int i=0;i<sentence.length();i++){
      char ch=sentence.charAt(i);
      if(result.indexOf(String.valueOf(ch))==-1){
        result+=ch;
      }
    }
    System.out.println(result);
  }
}
