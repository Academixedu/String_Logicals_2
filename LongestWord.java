public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence

public void largeword(String str){
    String []word=str.split(" ");
    int large=0;
    String longest="";
    
    
    for(int i=0;i<=word.length-1;i++)
    {
        
        if(word[i].length()>large)
        {
            large=word.length;
            longest=word[i];

        }
        
        

    }
    System.out.println("lonest word is : "+longest+ ": "+large);
   

    

}



public static void main(String[] args) {
    String str="sarvesh is  male";

    LongestWord obj=new LongestWord();
    obj.largeword(str);
    
}
}
