import java.util.Scanner;
public class Occurence {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =sc.nextLine();
        System.out.print("Enter a Character: ");
        char word =sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch==word){
            count++;
          }
      } 
      System.out.println(count);
  }
}
