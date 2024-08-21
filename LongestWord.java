import java.util.Scanner;

public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give your sentence");
        String sentence=sc.nextLine();
        int largest=0;
        String s="";
        for(String i:sentence.split(" ")){
            if(i.length()>largest)
            {
                    largest=i.length();
                    s=i;

            }

        }
        System.out.println(s+ " " +largest);
    }
}
 