public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static String findLongestWord(String sentence) {
    
    String[] words = sentence.split("\\s+");
    
    
    String longestWord = "";
    int maxLength = 0;

   
    for (String word : words) {
       
        if (word.length() > maxLength) {
            longestWord = word;
            maxLength = word.length();
        }
    }

    return longestWord;
}

public static void main(String[] args) {
   
    String sentence = "Java is a  programming language";
    
    
    String longestWord = findLongestWord(sentence);
    
    
    System.out.println("The longest word is: " + longestWord);
}
}
