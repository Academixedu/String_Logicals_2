public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void main(String[] args) {
    String v="Java12Script";
    for(int i=0;i<v.length();i++){
      char n=v.charAt(i);
      if(Character.isDigit(n)){
        System.out.println(n);
      }
    }
  }
}
