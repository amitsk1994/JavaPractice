/*
For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
Sample Input
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Sample Output
Valid
Invalid
Invalid
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      for(int i=0;i<testCases;i++)
  {
      try
      {
     String pattern = in.nextLine();
      Pattern.compile(pattern);
          System.out.println("Valid");
      }

         catch (Exception e)
              {
      System.out.println("Invalid");
         //Write your code
  }
}
   }
}
