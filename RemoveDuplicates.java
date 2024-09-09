public class RemoveDuplicates{
    // Prepare a Logic to find out and Remove Duplicate char in a String
    // Ex Hello World should be printed as Helo Wrd
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(result.indexOf(str.charAt(i)) == -1){
                result += str.charAt(i);
            }
        }
        System.out.println("After Removing Duplicates: "+result);
    }
}
