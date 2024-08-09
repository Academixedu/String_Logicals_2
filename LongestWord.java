public class LongestWord {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        String[] words = sentence.split("\\W+"); 

        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "Find the longest word in this sentence.";
        
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);
    }
}
