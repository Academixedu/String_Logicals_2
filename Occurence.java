public class Occurence {

      public static void main(String[] args) {
    
        String inputString = "Hello World";
        char targetChar = 'l';
    
        int first = inputString.indexOf(targetChar);
        int last = inputString.lastIndexOf(targetChar);
    
        int Count =last-first-4;
    
        System.out.println("Occurrences of '" + targetChar + "': " + Count);
      }
    }

