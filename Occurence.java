public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
    public static void main(String[] args) {
        String s = "Hello World";
        
        char charToCheck = 'l'; 
        int occ = findOccurrence(s, charToCheck);
        System.out.println("The character '" + charToCheck + "' occurs " + occ );
    }

    public static int findOccurrence(String str, char charToCheck) {
        int count = 0;
        str = str.toLowerCase();
        charToCheck = Character.toLowerCase(charToCheck);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToCheck) {
                count++;
            }
        }

        return count;
    }
}


