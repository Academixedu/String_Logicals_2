public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
    public static void main(String[] args) {
        String inputString = "Hello World";
        System.out.println(removeDuplicates(inputString));
    }

    public static String removeDuplicates(String input) {
        String result = ""; 
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if (result.indexOf(currentChar) == -1) {
                result += currentChar; 
            }
        }
        return result;
    }
}


