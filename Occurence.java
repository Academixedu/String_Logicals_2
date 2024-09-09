public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output
  import java.util.*;
public class Occurence {
// prepre a Logic to FindOut Occurence of Char in a String 
  // if we take 'l' to check occurence in String Hello World It Should return 3 as Output 
  public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        str = str.replace(" ", "");
        int max = 0;
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            count = 0;
            for (int j = i; j < ch.length; j++) {
                if (ch[j] == ch[i]) {
                    count++;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        System.out.println(max);
        System.out.println(str);

    }
}
}
