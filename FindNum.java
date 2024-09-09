public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Example if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void printNumbersFromString(String inputString) {
    
    for (int i = 0; i < inputString.length(); i++) {
        char ch = inputString.charAt(i);
        
        
        if (Character.isDigit(ch)) {
            System.out.println(ch);
        }
    }
}

public static void main(String[] args) {
    
    String inputString = "Java12Script";
    
   
    printNumbersFromString(inputString);
}
}
