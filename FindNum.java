public class findnum {
        // prepare a logic to find out numbers in a string and print them
          // Ex if we take Java12Script
          // output should be like
          // 1
          // 2
            public static void main(String[] args) {
                String str = "Java12Script";
        
                // Iterate through each character in the string
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
        
                    // Check if the character is a digit
                    if (Character.isDigit(ch)) {
                        System.out.println(ch);
                    }
                }
            }
        }
        


        

