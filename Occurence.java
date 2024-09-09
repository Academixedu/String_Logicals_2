import java.util.Scanner;

public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch = 'l';
    int count=0;

    for(int i=0; i<str.length(); i++){
      char st = str.charAt(i);
      if(ch == st){
        count=count+1;
      }
    }
    System.out.println(count);
  }
}
