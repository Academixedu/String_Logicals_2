public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String[] args) {
    String sd="Hello World";
    char c='l';
    int count=0;
    for(int i=0;i<sd.length();i++){
      char oc=sd.charAt(i);
      
        if(oc==c){
          count++;
        }

    }
    System.out.println(c +"occur value of l :"+count);

  }
}
