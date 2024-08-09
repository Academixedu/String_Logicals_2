public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
public static void main(String[] args) {
    String sd="i am from rajahmundry";
    String sep[]=sd.split(" ");
    String longestword=" ";
    int  maxlength=0;
    for(int i =0;i<sep.length;i++){
        if(sep[i].length()>maxlength){
            longestword=sep[i];
            maxlength=sep[i].length();
        }


        

    }
    System.out.println("longest word is: "+longestword);

}
}
