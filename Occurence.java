public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static int Occur(String s,char n){
    int count=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==n){
        count++;
      }
    }
    return count;
  }
  public static void main(String args[]){
    String str="Hello World";
    char n='l';
    System.out.println(Occur(str, n));
  }
}
