import java.util.Scanner;
public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give your sentence");
        String sentence=sc.nextLine();
        int large=0;
        String s="";
        for(String i:sentence.split(" ")){
            if(i.length()>large)//he is a boy
            //2>0
            {
                //large=2,s=she,,large=4,s=boy
                    large=i.length();
                    s=i;

            }
           
        }
        System.out.println(s+ " " +large);
    }
}
