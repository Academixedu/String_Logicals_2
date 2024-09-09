public class LongestWord{
// prepar a logic to findout longestword in sentence   
    public static void main(String[] args) {
        String str = "a logic to findout longestword in sentence ";

        String lw = findLongestWord(str);
        System.out.println("The longest word is: " + lw);
    }

    public static String findLongestWord(String str) {
       String[] words = str.split(" ");
        
        String lw = "";

        for (String word : words) {
            if (word.length() > lw.length()) {
              lw = word;
            }
        }
        
        return lw;
    }
}




