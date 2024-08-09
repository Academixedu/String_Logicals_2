public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args) {
    String sentence = "Success is not destination Success is a journey";
    String[] words = sentence.split(" ");
    String longestWord = words[0];
    for (String word : words) {  //Success
        if (word.length() > longestWord.length()) { //7>0,2>7,11>7 is true
            longestWord = word; //Success
        }
    }
    System.out.println("Longest word: " + longestWord);
}

}
