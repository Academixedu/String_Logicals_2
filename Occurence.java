import java.util.Scanner;
public class Occurence {
  public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    String s=a.nextLine();
    String s1=a.nextLine();
    int count=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==s1.charAt(0)){
        count++;
      }

    }
    System.out.println(count);
  }
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
}
