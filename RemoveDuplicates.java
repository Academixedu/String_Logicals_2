import java.util.Scanner;
public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String s = sc.nextLine();

    String word="";

    for(int i=0;i<s.length();i++){
      if(!word.contains((String.valueOf(s.charAt(i))))){
        word=word+s.charAt(i);
      } 
    } 
    System.out.println(word);
  }
}
