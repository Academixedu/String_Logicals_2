import java.util.Scanner;

public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

    public static void main(String args[]){
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
       Scanner s= new Scanner(System.in);
          System.out.println("Enter a sentence");
             String a=s.nextLine();
    for(char ch:a.toCharArray())
              {
    if(ch =='A' || ch=='a'|| ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
 
           System.out.println(ch+ " is a vowel");
    }
    else{
        System.out.println(ch+ " is a consonant");
               }
            }         
        }
    }

    

