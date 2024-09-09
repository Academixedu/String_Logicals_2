import java.util.Scanner;


public class VowelsandConsonents{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    String vowel = " ";
    String consonant = " ";

    for(int i=0; i<str.length(); i++){
        char ch1 = str.charAt(i);
        if(ch1 == 'A' || ch1 == 'E' || ch1=='I' || ch1=='O' || ch1== 'U' || ch1== 'a' || ch1=='i' || ch1=='o' || ch1=='u'){
            vowel=vowel+ch1;
        }
        else{
            consonant = consonant+ch1;
        }


    }
    System.out.println(vowel);
    System.out.println(consonant);
    sc.close();
}

}
