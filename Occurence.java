public class Occurence {
  public static void main(String[] args) {
    String s ="Hello World!";
    char c ='l';
    s= s.toLowerCase();
    String ss = String.valueOf(c);
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        if(c==s.charAt(i))
        count++;
    }
    System.out.println(count);
  }
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
}
