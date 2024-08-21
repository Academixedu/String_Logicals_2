public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
  public static void main(String args[])
  {
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
