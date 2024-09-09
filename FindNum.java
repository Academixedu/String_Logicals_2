public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void main(String[] args) {
    String input = "Java98193ript";


    for(int i = 0; i < input.length(); i++) {
        char out = input.charAt(i);

        if(Character.isDigit(out)) {
            System.out.println(out);
        }
    }
}
}

