public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Pursuing as a full stack developer at AcademixEdu";
      
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
    }
    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
}
