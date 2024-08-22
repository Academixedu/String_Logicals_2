public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence

    public static void main(String[] args) {
        String sentence = "Write a program to find the longest word in this sentence";
        findAndPrintLongestWord(sentence);
    }

    public static void findAndPrintLongestWord(String sentence) {
        String[] words = sentence.split(" ");  // Split the sentence into words
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}


