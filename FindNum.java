public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  void meth1(String word)
  {
    for(int i=0;i<=word.length()-1;i++)
    {
      if(Character.isDigit(word.charAt(i)))
      {
        System.out.println(word.charAt(i));
      }
    }
    System.out.println("------------------");
  }

  void meth2(String words)
  {
    for(int i=0;i<=words.length()-1;i++)
    {
      char ch=words.charAt(i);
      if (ch>='0' && ch<='9') 
      {
       System.out.println(ch); 
      }
    }
  }
  public static void main(String[] args) 
  {
     FindNum aobj=new FindNum();
    String word="Java123S";
    String words="Java98755s";

     aobj.meth1(word);
     aobj.meth2(words);

  }
}
