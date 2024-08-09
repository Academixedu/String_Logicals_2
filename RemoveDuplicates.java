public class RemoveDuplicates 
{

   
     String meth(String s)
  {
      String result = ""; // Initialize an empty result string

      // Traverse the string character by character
      for (int i = 0; i <= s.length()-1; i++)
       {
          char ch = s.charAt(i);
          // Check if the character is already in the result string
          boolean flag = false;
          for (int j = 0; j <= result.length()-1; j++)
           {
              if (result.charAt(j) == ch) 
              {
                  flag = true;
                  break;
              }
          }
          // If the character is not a duplicate, append it to the result
          if (!(flag)) 
          {
              result= result+ch;
          }
      }

      // Return the result string
      return result;
  }

  public static void main(String[] args)
   {
      // Example input string
      String s = "Hello World";
      // Call the removeDuplicates method and print the result
      String result = new RemoveDuplicates().meth(s);
      System.out.println("String after removing duplicates: " + result);
  }
}