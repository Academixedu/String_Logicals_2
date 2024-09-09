import java.util.Scanner;

public class RemoveDuplicates{
// Prepare a Logic to find out and Remove Duplicate char in a String
  // Ex Hello World should be printed as Helo Wrd

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    for(int i=0; i<str.length(); i++){
      char ch1 = str.charAt(i);
      for(int j=0; j<str.length(); j++){
        char ch2 = str.charAt(j);

        if(ch1 == ch2){
          String newStr = str.replace("ch1", "");
          System.out.println(newStr);
        }
      }
  }

}
}
