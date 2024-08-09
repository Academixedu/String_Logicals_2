import java.util.Scanner;
public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your String ");//fayaz515
    String s = sc.nextLine();
    int temp=0;
     for(int i=0;i<=s.length();i++){// i=0, i<=8,
      char num=s.charAt(i);// 0=f,1=a,2=y,3=a,4=z,5=5,6=1,7=5
      if(Character.isDigit(num)){
          temp = num; //storing the number in temp 
          System.out.println("numbers are : "+num);
      }

       }
     }
}
