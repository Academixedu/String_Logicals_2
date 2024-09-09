public class Occurence {
  public static void main(String[] args) {
    String ln="Hello world";
    char ch='l';
    int count=0;
    for(int i=0;i<ln.length()-1;i++){
      char ch1=ln.charAt(i);
      if(ch==ch1){
        count++;
      }
    }
    System.out.println("Character: " +ch+ " occurance: "+count);
  }
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
}
