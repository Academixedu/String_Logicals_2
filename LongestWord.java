import java.util.Scanner;
public class LongestWord
{
// Prepare a Logic to findout LongestWord in Sentence

 void meth1(String s)
 {
    String [] word=s.split(" ");
  
    int large=0;
    String LongestWord="";

    for (int i=0;i<=word.length-1;i++)
    {
        if (word[i].length()>large)
        {
           large=word[i].length();
           LongestWord=word[i];
        }
    }


    System.out.println("The longest word is => "+LongestWord +" : "+large);

 }
    public static void main(String[] args) 
    {
    //   String s="Robert D jr is best actor in MCU";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
      LongestWord obj =new LongestWord();
      obj.meth1(s);
      sc.close();
    }

}