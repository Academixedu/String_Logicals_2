public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  
    public static void main(String[] args) {
        String input = "Hello World";
        char target = 'l';  // Character to find the occurrence of
        int count = findOccurrence(input, target);
        System.out.println("The character '" + target + "' occurs " + count + " times.");
    }

    public static int findOccurrence(String str, char ch) {
        int count = 0;

        // Convert the string to lowercase to make the search case-insensitive, if needed
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}


