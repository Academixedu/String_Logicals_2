public class LongestWord{
public static void Long(String s){
    String words[]=s.split(" ");
    int[]wordslength=new int[words.length];
    int maxlength=0;
    String LongestWord="";
    for(int i=0;i<=words.length-1;i++){
        wordslength[i]=words[i].length();
        if(wordslength[i]>maxlength){
            maxlength=wordslength[i];
            LongestWord=words[i];
        }
    }
    System.out.println(maxlength+" "+LongestWord);
}
public static void main(String[] args) {
    String s="i am a girl";
    Long(s);
}
}
    