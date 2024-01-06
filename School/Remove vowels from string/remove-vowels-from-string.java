//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String S) {
        // code here
        StringBuilder result = new StringBuilder(S);
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < S.length() ; i++){
            if (result.charAt(i) == 'a' || result.charAt(i) == 'e' || result.charAt(i) == 'i' || result.charAt(i) == 'o' || result.charAt(i) == 'u' ||
                result.charAt(i) == 'A' || result.charAt(i) == 'E' || result.charAt(i) == 'I' || result.charAt(i) == 'O' || result.charAt(i) == 'U') {
               
            }
            else{
                ans.append(result.charAt(i));
            }
        }
        return ans.toString();
    }
}