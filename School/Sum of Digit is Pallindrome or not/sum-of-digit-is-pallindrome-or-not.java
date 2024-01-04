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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int x  = N;
        int ans = 0 ;
        while(x > 0){
            int rem = x % 10;
            x = x / 10;
            ans = ans + rem;
        }
        
        String str = "" + ans;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                return 0;
            }
        }
        return 1;
    }
}