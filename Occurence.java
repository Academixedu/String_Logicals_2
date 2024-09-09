public class Occurence {

  public static void main(String[] args) {
    String name="hello hello";
    int targetchar = 'l';
    int first = name.indexOf(targetchar);
    int last = name.lastIndexOf(targetchar);
    int count =last-first-4;
    System.out.println("occurrences of"+ targetchar+":"+count);

  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
}
}