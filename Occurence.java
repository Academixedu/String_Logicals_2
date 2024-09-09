public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output
 

    
    public static int findCharOccurrence(String inputString, char ch) {
        
        int count = 0;

  
        inputString = inputString.toLowerCase();
        ch = Character.toLowerCase(ch);

       
        for (int i = 0; i < inputString.length(); i++) {
            
            if (inputString.charAt(i) == ch) {
                count++;
            }
        }

        return count; 
    }

    public static void main(String[] args) {
      
        String inputString = "Hello World";
        char ch = 'l';
        
        
        int occurrence = findCharOccurrence(inputString, ch);
        
       
        System.out.println("The character '" + ch + "' occurs " + occurrence + " times.");
    }
}
 

