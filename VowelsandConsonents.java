public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
public static void main(String[] args) {
    String str = "Hello World";
    String vowels = "";
    String consonants = "";

    for (char ch : str.toLowerCase().toCharArray()) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels += ch;
        } else if (ch >= 'a' && ch <= 'z') {
            consonants += ch;
        }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
}
}



