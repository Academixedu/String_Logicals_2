public class LongestWord {

    public static void main(String[] args) {
        String sentence = "Chanakya anna is our Java professor";
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
