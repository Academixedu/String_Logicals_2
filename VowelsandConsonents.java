public class VowelsandConsonents{
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s = s1.toLowerCase();
        String ss="";
        for(int h=0;h<s.length();h++)
        {
            if(s.charAt(h)>='a' && s.charAt(h)<='z')
            ss+=s.charAt(h);
        }
        char ovels[] = new char[s.length()];
        char consosnents [] = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==('a')||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i')
            ovels[i]=s.charAt(i);
            else
            consosnents[i]=s.charAt(i);
        }
        System.out.print("ovels are: ");
        for(int j=0;j<ovels.length;j++)
        System.out.print( ovels[j]+" ");
        System.out.println();
System.out.print("consonensts are: ");
       for(int jj=0;jj<consosnents.length;jj++)
       System.out.print(consosnents[jj]+ " ");

      
    }
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String
    
}
