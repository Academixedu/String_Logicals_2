public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String[] args) {
   
    String inputString = "Hello World";
    char targetChar = 'l';

    int first = inputString.indexOf(targetChar);
    int last = inputString.lastIndexOf(targetChar);

    int Count =last-first-4;

    System.out.println("Occurrences of '" + targetChar + "': " + Count);
  }
}
