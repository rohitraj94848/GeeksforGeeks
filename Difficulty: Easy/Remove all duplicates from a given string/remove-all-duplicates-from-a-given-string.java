//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        HashMap<Character,Integer> mp = new HashMap<>();
        StringBuilder s = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++){
            if(!mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),1);
                //s.append(str.charAt(i));
                s.append(str.charAt(i));
            }
            
        }
        return s.toString();
    }
}

