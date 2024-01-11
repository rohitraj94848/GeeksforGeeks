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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int fullPrime(int N) {
       
        if (!isPrime(N)) {
            return 0;
        }

       
        while (N > 0) {
            int digit = N % 10;
            if (!isPrime(digit)) {
                return 0;
            }
            N /= 10;
        }

        return 1;
    }

    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
