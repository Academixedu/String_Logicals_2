import java.util.Scanner;
public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        
        String max="";
        int maxLen = 0;

        for (String word : words) // Iterate through each word in the array
         {
            if (word.length() > maxLen) {
                max = word;
                maxLen = word.length();
            }
        }
        System.out.println(max+", I am the Longest Word with Length :" + max.length());
    }
}
