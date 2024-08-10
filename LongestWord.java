public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
    public static void main(String[] args) {
        String sentence = "If you haven't got problems, I am sorry son";
        
        String[] words = sentence.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("The longest word is: " + longestWord);
    }
}
