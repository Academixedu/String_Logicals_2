public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void main(String[] args) {
    
  
  String sd="java12Script";
  for(int i=0;i<sd.length();i++){
    if(Character.isDigit(sd.charAt(i))){
      System.out.println("numbers in string :"+sd.charAt(i));
    }
  }
  }

}
