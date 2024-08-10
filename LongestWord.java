public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence

public static void main(String[] args) {
    String sentence = "Atomic Habits By James Clear"; 
    String longestWord = findLongestWord(sentence);             
    System.out.println(" longest: " + longestWord);  
}

public static String findLongestWord(String sentence) {
    String longestWord = "";
    for (String word : sentence.split(" ")) {
        if (word.length() > longestWord.length()) {
            longestWord = word; 
        }
        else if(word.length()==longestWord.length()){
            System.out.println("Longestnumber are:"+ word +" "+ longestWord);
        }
    }

    return longestWord; 
}
}

