public class FindNum{
  public static void Num(String s){
    for(int i=0;i<=s.length();i++){
      char a=s.charAt(i);
      if(Character.isDigit(a)){
        System.out.println(a);
      }
    }
  }
  public static void main(String[] args) {
    String s="ja45va12script";
    FindNum.Num(s);
  }
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
}
