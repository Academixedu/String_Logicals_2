import java.util.Scanner;
public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String s = sc.nextLine();
    System.out.println("Vowels :");

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch);
        }
    }   

    
    System.out.println("Consonants :");
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            System.out.println(ch);
        }
    }   
}
}
