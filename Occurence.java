public class Occurence 
{
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
public int meth4(String s)
{
  int count=0;
  for(int i=0;i<=s.length()-1;i++)
  {
    if(s.charAt(i)=='t')
    {
      count++;
    }
  }
  return count;
}
public static void main(String[] args) 
{
  Occurence aobj= new Occurence();
  String s="Go to the safe zone asaft";
 int result = aobj.meth4(s);
 System.out.println("------------");
 System.out.println("The count of word that you have entered is : "+result);
}
}
