public class RemoveDuplicates{
    public static void main(String[] args) {
        String input = "yummy yummy in my tummy";
        String result = "";
        for (char c : input.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println(result);
    }
}

// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd

