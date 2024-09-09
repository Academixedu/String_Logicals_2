import java.util.*;
public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence
 public static void main(String[] args) {
        System.out.println("enter the worlds with space");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        String[] st = str.split(" ");
        int max = 0;
        for (int i = 0; i < st.length; i++) {
            if (st[i].length() > max) {
                max = st[i].length();
                rev = st[i];
            }
        }
        System.out.println(rev + ":" + max);

    }
}
