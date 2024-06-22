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
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String , Integer> map = new HashMap<String , Integer>();
        for(String str : arr){
            map.put(str,map.getOrDefault(str,0)+1);
            
        }
        PriorityQueue<Map.Entry<String,Integer> > pq = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        pq.poll();
        return pq.poll().getKey();
    }
}