/*
Sample Input
2
0 2 10
5 3 5
Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int arr[][]=new int[t][3];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            arr[i][0]=a;
            arr[i][1]=b;
            arr[i][2]=n;
        }

        for(int i=0;i<t;i++){
            int a1=arr[i][0];
            int b1=arr[i][1];
            int c1=arr[i][2];
            int seq=a1;
            int k=(int)Math.pow(2,c1-1);
           // for(int l=0;l<c1;l++){
            for(int j=1;j<=k;j=j*2){
                seq+=j*b1;
                System.out.print(seq+" ");
            }
            //}
            System.out.println();
            k++;
        }
        in.close();
    }
}
