public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args) {
    String sentence = "My name is manikanta"; 
    String longestWord = findLongestWord(sentence);             
    System.out.println("The longest word is: " + longestWord);  
}

public static String findLongestWord(String sentence) {
    String longestWord = "";
    for (String word : sentence.split(" ")) {
        if (word.length() > longestWord.length()) {
            longestWord = word; 
        }
        else if(word.length()==longestWord.length()){
            System.out.println("Both Contains same Length "+word+" "+longestWord);
        }
    }

    return longestWord; 
}
}
