//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String modify(String s) {
        StringBuilder str = new StringBuilder(s);

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isVowel(str.charAt(i)) && isVowel(str.charAt(j))) {
                swap(str, i, j);
                i++;
                j--;
            } else if (!isVowel(str.charAt(i))) {
                i++;
            } else {
                j--;
            }
        }

        return str.toString();
    }

    static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }

    static void swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
}
