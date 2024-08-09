import java.util.Scanner;
public class FindNum{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =sc.nextLine();
        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(Character.isDigit(ch)){
            System.out.println(ch);
          }
      } 
   }
}
