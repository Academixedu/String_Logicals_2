import java.util.Scanner;

public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] st= str.split(" ");
    String Word = " ";

    for (String string : st) {
        if(string.length() > Word.length()){
            Word = string;
        }
        
    }
    System.out.println(Word);
}
}
