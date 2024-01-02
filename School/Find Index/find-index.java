//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int N, int key) 
    { 
        //code here.
        int result[] = {-1,-1};
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                result[0] = i;
                break;
            }
        }
        
        if (result[0] == -1) {
            return result;
        }
        
        for(int i = result[0] ; i < arr.length ; i++){
            if(arr[i] == key){
                result[1] = i;
                
            }
        }
        return result;
    }
}