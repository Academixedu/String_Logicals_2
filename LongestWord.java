import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String a=s.nextLine();
        String longestword = "";
        int maxlength = 0;
        for(String i:a.split(" "))//she is beautiful
        {
            if(i.length()>maxlength){
                
                maxlength=i.length();
                longestword=i;
            }
        }
        System.out.println(longestword);
        }
}
