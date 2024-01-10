//{ Driver Code Starts
// Initial Template for Java

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
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // Calculate the sum of factorials of digits
        int sum = 0;
        int num = N;

        while (num > 0) {
            int digit = num % 10;
            sum += fact(digit);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return (sum == N) ? 1 : 0;
    }

    static int fact(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return (int) factorial;
    }
}
