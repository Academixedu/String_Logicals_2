public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void Num(String s){
    for(int i=0;i<=s.length();i++){
      char r=s.charAt(i);
      if(Character.isDigit(r)){
        System.out.println(r);
      }
    }
  }
  public static void main(String args[]){
    String s="Java12Scri5788pt";
    Num(s);
  }
}
