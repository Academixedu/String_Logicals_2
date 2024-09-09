public class LongestWord{
    public static void main(String[] args) {
        String k="hello what do u need";
        String [] m=k.split("");
        String longword="";
        int length =0;
        for (String string:m) {
            if(string.length()>length){
                length=string.length();
                longword=string;

            }
           System.out.println(longword);
        }

    }



// Prepare a Logic to findout LongestWord in Sentence
}
