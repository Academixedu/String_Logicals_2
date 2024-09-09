
import java.util.Scanner;

public class VowelsandConsonents{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String vowels="";
        String consonants="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                
                vowels+=c;
            }
            else if(c>='a'&&c<='z'){
               
                consonants+=c;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
