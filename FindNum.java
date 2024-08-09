public class FindNum
{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2

  void meth1(String str)
  {
      for (int i=0;i<=str.length()-1;i++)
      {
         char ch=str.charAt(i);

         if (ch>='0' && ch<='9')
         {
          System.out.println(ch);
         }
      }

      System.out.println("----------------------------------");
  }


  void meth2(String s )
  {     
    for (int i=0;i<=s.length()-1;i++)
    {
      if(Character.isDigit(s.charAt(i)))
      {
        System.out.println(s.charAt(i));
      }
    }  
  }


  public static void main(String[] args) 
  {
    String s= "React786JS";
    String str="Java32Script";
      FindNum obj=new FindNum();
      obj.meth1(s);
      obj.meth2(str);
  }

}
