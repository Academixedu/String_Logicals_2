import java.util.Scanner;
public class LongestWord{
    public static void main(String args[])
{
// Prepare a Logic to findout LongestWord in Sentence
Scanner s=new Scanner(System.in);
System.out.println("enter a sentence");
String a=s.nextLine();
int large=0;
String largest_word="";
for(String i:a.split(" "))//she is beautiful
{
    if(i.length()>large){

        large=i.length();
        largest_word=i;
    }
}
System.out.println(largest_word);
}
}

