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
            int ans  = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static int oppositeFaceOfDice(int N) {
        int result = -1; // Default value in case N is invalid

        switch (N) {
            case 1:
                result = 6;
                break;
            case 2:
                result = 5;
                break;
            case 3:
                result = 4;
                break;
            case 4:
                result = 3;
                break;
            case 5:
                result = 2;
                break;
            case 6:
                result = 1;
                break;
            
        }

        return result;
    }
}
