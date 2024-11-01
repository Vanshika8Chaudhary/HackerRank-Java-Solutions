import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
             int ans = a;
        for(int j=0;j<n;j++){
            int x = (int) (Math.pow(2,j))*b;
            ans+=x;
            System.out.print( ans + " ");
        }
        System.out.println();
        }
        // take a 
        // for loop to i to n-1
        // add + prev 
       
        in.close();
        
    }
}
