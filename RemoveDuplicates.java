public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd
  public static void main(String[] args) {
    String str = "Hello World";
    StringBuilder a = new StringBuilder();
    for (char c : str.toCharArray()) {
        if (a.indexOf(String.valueOf(c)) == -1) {
            a.append(c);
        }
    }
    System.out.println(a.toString());
}

}
