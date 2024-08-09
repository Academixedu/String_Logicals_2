public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void Long(String s){
String []words=s.split(" ");
int []wordslength=new int[words.length];
int maxlength=0;
String longword="";
for(int i=0;i<=words.length-1;i++){
   wordslength[i]=words[i].length(); 
       if(wordslength[i]>maxlength){
        maxlength=wordslength[i];
        longword=words[i];
       }
}
System.out.println(maxlength+" and the word is "+longword);
}
public static void main(String args[]){
    String s="i am a good boy";
    Long(s);
}
}
