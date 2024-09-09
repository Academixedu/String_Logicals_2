import java.util.*;
public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String rev = "";
        System.out.println("vowel::");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                System.out.println(ch[i]);
            else {
                rev += ch[i];
            }
        }
        System.out.println("Non-vowel::");
        for (int i = 0; i < rev.length(); i++) {
            System.out.println(rev.charAt(i));
        }

    }
}
