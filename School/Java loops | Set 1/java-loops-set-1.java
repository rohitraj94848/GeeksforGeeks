//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N){
        
        ArrayList<Integer> li = new ArrayList<>();
        li.add(even(N));
        li.add(odd(N));
        return li;
        
    }
        static int even(int N){
            int e = 0;
            for(int i = 2 ; i <= N ;i = i + 2){
                
                e = e + i;
            }
            return e;
        }
        static int odd(int N){
            int e = 0;
            for(int i = 1 ; i <= N ;i = i + 2){
                
                e = e + i;
            }
            return e;
        }
    
}