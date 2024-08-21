import java.util.Scanner;
public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                str1 = str1 + str.charAt(i);
            } else {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str1);
        System.out.println(str2);

    }
}
