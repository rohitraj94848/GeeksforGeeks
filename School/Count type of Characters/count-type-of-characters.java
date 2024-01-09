//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here    
        int[] arr = new int[4];
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int specialCharCount = 0;
        int numericCount = 0;
        
        for(int i = 0 ; i <s.length() ; i++){
             char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercaseCount++;
                arr[0] = uppercaseCount;
            }
            else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
                arr[1] = lowercaseCount;
            } 
            else if (Character.isDigit(ch)) {
                numericCount++;
                arr[2] = numericCount;
            } 
            else {
                specialCharCount++;
                arr[3] = specialCharCount;
            }
        }
        return arr;
    }
}