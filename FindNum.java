public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  import java.util.*;
public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length();i++){
      if(Character.isDigit()){
        System.out.println(ch[i]);
      }
    }
    
  }
}
}
