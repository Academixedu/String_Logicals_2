import java.util.Scanner;

public class LongestWord{
// Prepare a Logic to findout LongestWord in Sentence

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int max = 0;
        String l = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
                l = arr[i];
            }
        }
        System.out.println(l+" "+max);
        sc.close();
    }
}
