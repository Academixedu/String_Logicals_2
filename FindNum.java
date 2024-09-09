public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2

    public static void main(String[] args) {
  
        String s = "java125cript";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

           if (Character.isDigit(currentChar)) {
                System.out.println(currentChar);
            }
        }
    }
}


