public class RemoveDuplicates {
  public static void main(String[] args) {
     
      String sd = "Hello World";
      
      String result = "";
      
     
      for (int i = 0; i < sd.length(); i++) {
          char res2 = sd.charAt(i);
          
        
          if ( result.indexOf(res2)==-1) {
            result=result+res2;
              
          }
      }
      
     
      System.out.println(result);
  }
}
