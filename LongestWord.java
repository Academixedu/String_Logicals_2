public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
    public static void main(String[] args) {
        String s = "Java is a object oriented language";
        String[] words = s.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("longest word is: " + longestWord);
    }
}
