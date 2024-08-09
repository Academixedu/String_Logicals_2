public class VowelsandConsonents
{
// Prepare a Logic to FindOut Vowels and Consosnents and Print them Spearately from a String

void check(String s)
{

    for (int i=0;i<=s.length()-1;i++)
    {
        char ch=s.charAt(i);

        if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch);
        }
        

    }
}


public static void main(String[] args) 
{
    String s="My name is sarvesh";
   VowelsandConsonents obj=new VowelsandConsonents();
   obj.check(s);
}

}
