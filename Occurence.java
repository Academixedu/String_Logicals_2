import java.util.Scanner;

public class Occurence{
  // prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your String:");
        String s = sc.nextLine();
        System.out.println("Enter the character to find its occurrence:");
        char c = sc.next().charAt(0);
        
        int temp = 0;
        
        for (int i = 0; i < s.length(); i++) {
          char occu =s.charAt(i);
            if (occu == c) {
              temp++;
            }
        }
        
        System.out.println( c + " occurs " + temp+ " times in the string.");
    }
}
