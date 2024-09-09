public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
  
public static String removeDuplicates(String input) {

    StringBuilder result = new StringBuilder();


    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);

        if (result.indexOf(String.valueOf(ch)) == -1) {
            result.append(ch); 
        }
    }

    return result.toString(); 
}
public static void main(String[] args) {
  String input = "java and javascript";
  String result = removeDuplicates(input);
  System.out.println("String after removing duplicates: " + result);
}

}

