//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int X1 = Integer.parseInt(S[0]);
            int Y1 = Integer.parseInt(S[1]);
            int R1 = Integer.parseInt(S[2]);
            int X2 = Integer.parseInt(S[3]);
            int Y2 = Integer.parseInt(S[4]);
            int R2 = Integer.parseInt(S[5]);
            Solution ob = new Solution();
            System.out.println(ob.circleTouch(X1, Y1, R1, X2, Y2, R2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        //Write your code here
        int d1 = X2 - X1;
        int d2 = Y2 - Y1;
        
        int c2c1 = (d1*d1)+(d2*d2);
        
        int res = (int)Math.sqrt(c2c1);
        
        
        if(res >= R1+R2){
            return 0;
        }else{
            return 1;
        }
    }
}