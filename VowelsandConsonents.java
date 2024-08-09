import java.util.Scanner;
public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiou".indexOf(ch) >= 0) {
                vowels =vowels+ch;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants=consonants + ch;
             }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}

