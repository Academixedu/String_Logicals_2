import java.util.*;
public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char arr[] = s.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>='0' && arr[i]<='9')
      System.out.print(arr[i]+" ");
    }

  }
}
