public class LongestWord{
    // Prepare a Logic to findout LongestWord in Sentence
    public static void main(String[] args) {
        String str = "This is a Java Programming";
        String[] words = str.split(" ");
        String longestWord = "";
        int max = 0;
        for(String word : words){
            if(word.length() > max){
                max = word.length();
                longestWord = word;
            }
        }
        System.out.println("Longest Word is: "+longestWord);
    }
}
