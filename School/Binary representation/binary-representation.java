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
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        // code here
        String binaryRepresentation = Integer.toBinaryString(N);
        String str = "";

        for (int i = 0; i < 30 - binaryRepresentation.length(); i++) {
                str += "0";
                
                       }
        return (str+binaryRepresentation);
    }
}