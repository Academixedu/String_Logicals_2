import java.util.Scanner;
public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                s1 = s1 + str.charAt(i);
            } else {
                s2 = s2 + str.charAt(i);
            }
        }
        System.out.println(s1);
        System.out.println(s2);

    }
}