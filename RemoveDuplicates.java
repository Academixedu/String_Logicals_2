import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates{
  public static String dup(String s){
s=s.replaceAll(" ", "").toLowerCase();
// s1=s1.replaceAll(" ", "").toLowerCase();
char[]c=s.toCharArray();
// char[]c1=s1.toCharArray();
Arrays.sort(c);
String res = "";
if (c.length > 0) {
    res = String.valueOf(c[0]);
}
for(int i=1;i<c.length;i++){
  if (c[i] != c[i - 1]) {
    res+= c[i];  
}
}
return res;
  }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter String");
    String line=s.next();
    String res=dup(line);
    System.out.println(res);

  }
}
