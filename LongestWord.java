public class LongestWord{
    public static void main(String[] args) {
        String Sentence="INDIA WON THE WORLDCUP";
        System.out.println(findLargestWord(Sentence));
    }
    private static String findLargestWord(String Sentence){
        String[] word=Sentence.split(" ");
        String largestWord="";
        for(int i=0;i<word.length;i++){
            if(word[i].length()>largestWord.length()){
                largestWord=word[i];
            }
        }
        return largestWord;
    }
// Prepare a Logic to findout LongestWord in Sentence
}
