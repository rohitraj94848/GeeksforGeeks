//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zero=0,one=0,two=0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]==0){
                zero++;
            }
            else if(a[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        
        for(int i = 0 ;i < zero;i++){
            a[i]=0;
        }
        for(int i = zero ; i < zero+one;i++){
            a[i]=1;
        }
        for(int i = zero+one; i < n ;i++){
            a[i]=2;
        }
          
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends