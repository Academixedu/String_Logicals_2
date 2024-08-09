import java.util.Scanner;
public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your sentence");
    String sentence=sc.nextLine();  
    System.out.println("enter target character");
    char target=sc.next().charAt(0); 
    int count=0;
    for(int i=0;i<sentence.length();i++){ 
        if(target==sentence.charAt(i)){ 
          count++; 
        }
        
    } 
    System.out.println(count);
  }
}


// charAt():The charAt() method in Java is used to retrieve a character at a specific index from a string. The index is zero-based, meaning the first character of the string is at index 0, the second character is at index 1, and so on.