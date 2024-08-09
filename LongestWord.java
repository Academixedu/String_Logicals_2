import java.util.Scanner;
public class LongestWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String str =sc.nextLine();
        String words[]=str.split(" ");
        String max="";
        int length=0;
        for(String word:words){
            if(word.length()>length){
                length=word.length();
                max=word;
            }
        }
        System.out.println(max+" "+max.length());
    }
}
