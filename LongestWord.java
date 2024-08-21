import java.util.*;
public class LongestWord{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String arr[] = s.split(" ");
     // Arrays.sort(arr);
     int lenting=0;
     String s1="";
     for(int i=0;i<arr.length;i++)
     {
        int len = arr[i].length();
        if(len>lenting)
        {s1=arr[i];lenting=len;}
     }
      System.out.println(s1);
      sc.close();
    }
// Prepare a Logic to findout LongestWord in Sentence
}
