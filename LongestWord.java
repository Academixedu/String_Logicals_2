public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args) {
    String n="hello what do u need ";
    String[] m=n.split(" ");
    String longestword="";
    int Length =0;
    for (String string : m) {
        if(string.length()>Length){
            Length=string.length();
            longestword=string;
        }
        System.out.println(longestword);
    }

}
}
