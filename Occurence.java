

public class Occurence {
    public static void main(String[] args) {

    String s= "I am Revathi";
    char c= 'a';
    int Count =findCharOccurrences(s, c);
    System.out.println("Occurrences of " +c+ ": " + Count);
  }
  public static int findCharOccurrences(String str, char targetChar) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == targetChar) {
        count++; 
      }
    }
    return count;
  }
}
