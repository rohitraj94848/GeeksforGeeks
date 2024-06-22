//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String longestCommonPrefix(String s[], int n) {
        if (n == 0) return "-1";
        
        String tmp = s[0];
        
        for (int i = 1; i < n; i++) {  // Start from the second string
            int j = 0;
            while (j < tmp.length() && j < s[i].length() && tmp.charAt(j) == s[i].charAt(j)) {
                j++;
            }
            tmp = tmp.substring(0, j);  // Reduce the prefix
            
            if (tmp.isEmpty()) return "-1";  // No common prefix found
        }
        return tmp;
    }
}
