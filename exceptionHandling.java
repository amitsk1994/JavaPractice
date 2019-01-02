/*
You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{int x=s.nextInt();
            int y=s.nextInt();
            System.out.println(x/y);
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
       catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
