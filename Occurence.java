public class Occurence
{
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 

int meth1(String s)
{
  int count=0;

  for (int i=0;i<=s.length()-1;i++)
  {
    if(s.charAt(i)=='e')
    {
      count++;
    }
  }

  return count;
}


public static void main(String[] args) 
  {
    String s="Lets play togetheeer";
    Occurence obj=new Occurence();
   int result= obj.meth1(s);
   System.out.println("The count of word that you have entered is : "+result);
  }


}