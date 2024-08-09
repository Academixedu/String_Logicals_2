public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2

void math1(String s){
  for(int i=0;i<=s.length()-1;i++)
  {
    if(Character.isDigit(s.charAt(i)))
    {
System.out.println(s.charAt(i));
    }
     
  }
  System.out.println("--------------------");
}
void math2(String str){
  
  for(int i=0;i<=str.length()-1;i++){
    char ch=str.charAt(i);
    if(ch>='0'&& ch<='9'){
      System.out.println(ch);
    }

  }

}

  public static void main(String[] args) {
    String s="amsture4258";
    String str="java5126";
FindNum aobj=new FindNum();
   aobj.math1(s);
   aobj.math2(str);




  }
}
