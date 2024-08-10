public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String[] args) {
    String str = "oh, way down we goo";
    char targetChar = 'o';
    int count = 0;
    
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == targetChar) {
            count++;
        }
    }
    
    System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");
}
}
