import java.util.Scanner;

public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your sentence");
    String sentence=sc.nextLine();
    for(int i=0;i<sentence.length();i++){
        char ch=sentence.charAt(i);
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            System.out.println(ch+ " is a vowel");
        }
        else{
            System.out.println(ch+ " is a consonant");
        }
    }
}

}
