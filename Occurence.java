public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 

public int occur(String s){
int count=0;
for(int i=0;i<=s.length()-1;i++){
  if(s.charAt(i)=='t'){
    count++;
  }
}
return count;

  
}

  public static void main(String[] args) {
    String s="choko is male  toto";
    Occurence obj=new Occurence();
  obj.occur(s);
    System.out.println("the ocuurence => "+obj.occur(s));

  }
}
