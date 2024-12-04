import java.util.Scanner;

public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your String "); // my name is Fayaz
    String s = sc.nextLine();
    String[]arr=s.split(" ");
    String temp=arr[0];
    for(int i=1;i<arr.length;i++){//i<=2
        if (arr[i].length() > temp.length()) {
         temp= arr[i];
        }        
    }
    System.out.println("longest word is: " +temp);

}
}