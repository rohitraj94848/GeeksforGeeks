//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] result = new long[N - K + 1];
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;

        for (int i = 0; i < N; i++) {
            // Remove elements that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - K + 1) {
                deque.pollFirst();
            }

            // Add the current element index if it is negative
            if (A[i] < 0) {
                deque.offerLast(i);
            }

            // If the window has hit size K, record the result
            if (i >= K - 1) {
                if (!deque.isEmpty()) {
                    result[index++] = A[deque.peekFirst()];
                } else {
                    result[index++] = 0; // or any sentinel value indicating no negative number in this window
                }
            }
        }

        return result;
    }
}
