public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output
  public static void main(String[] args) {
    String name="hello hello";
    int targetchar = 'e';
    int first = name.indexOf(targetchar);
    int last = name.lastIndexOf(targetchar);
    int count =last-first-4;
    System.out.println("occurrences of"+ targetchar+":"+count);
  }
 
}
