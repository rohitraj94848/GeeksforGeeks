//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        long ans_2 = n * 2;
        long ans_3 = n * 3;
        int ans = 1;
        String str2 = "" + n + ans_2 + ans_3;
        
        if(str2.length()==9){
            
        for(int i = 1 ; i <= 9; i++){
             if(!str2.contains(String.valueOf(i)))
             return false;
         }   
         return true;
        }

        return false;
    }
}