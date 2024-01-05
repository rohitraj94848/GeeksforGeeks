//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nPr(long n, long r){
        // code here
        long N = n;
        long D = n - r ;
        if(D == 0){
            D = 1;
        }
        long numerator = multiply(N);
        long denominator = multiply(D);
        long result = numerator / denominator;
        return result;
        
    }
    static long multiply(long n){
        long ans = 1;
        while(n != 0){
            ans = ans  * n;
            n = n -1 ;
        }
        return ans;
    }
}