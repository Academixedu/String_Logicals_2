public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args) {
    String sentence = "This is a longest word sentence";
    String[] words = sentence.split("\\s+");
    String longestWord = "";

    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }
    System.out.println("Longest word: " + longestWord);
}
}

