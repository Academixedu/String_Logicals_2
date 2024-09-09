public class VowelsandConsonents{
    // Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
    public static void main(String[] args) {
        String str = "Hello World";
        String vowels = "";
        String consonents = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' ||str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||  str.charAt(i) == 'i'||  str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u'|| str.charAt(i) == 'U'){
                vowels += str.charAt(i);
            }else{
                consonents += str.charAt(i);
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonents: "+consonents);
    }
}
