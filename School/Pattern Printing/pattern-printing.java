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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printPattern(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static void printPattern(int N) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st.append("*");
            System.out.print(st + " ");
        }
    }
}
