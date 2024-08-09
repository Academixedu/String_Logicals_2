import java.util.Scanner;

public class LongestWord
{
// Prepare a Logic to findout LongestWord in Sentence
public void meth3(String s)
{
  String[] word=s.split(" ");
  String LongestWord="";
  int length=0;
  for(int i=0;i<=word.length-1;i++)
  {
    if(word[i].length()>length)
    {
      length=word[i].length();
      LongestWord=word[i];
    }
  }
  System.out.println("The Longest word is this String is => "+LongestWord+" : "+length);
}
public static void main(String[] args) 
{
    Scanner aobj=new Scanner(System.in);
    System.out.println("---------------- ");
    System.out.println("Enter the string => ");
    String s=aobj.nextLine();
    LongestWord aobj1=new LongestWord();
 
  aobj1.meth3(s);

}

}
