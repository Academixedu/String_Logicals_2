public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
public static void main(String[] args) {
    String inputString = "humptydumpty";

   
    inputString = inputString.toLowerCase();

    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < inputString.length(); i++) {
        char ch = inputString.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
}
}


