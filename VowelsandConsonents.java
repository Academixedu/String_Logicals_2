import java.util.Scanner;
public class VowelsandConsonents{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =sc.nextLine();
        System.out.print("vowels:");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'  || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.print(ch);
            }
        }
        System.out.println();
        System.out.print("Consonants:");
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            System.out.print(ch);
        }
    }   
  }
}
