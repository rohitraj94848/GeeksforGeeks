//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
        ArrayList<String> li = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char currChar = s.charAt(i);
            if(Character.isDigit(currChar))
            {
                st.append(currChar);
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    st.append(s.charAt(++i));
                }
                li.add(st.toString());
                st.setLength(0);
            }
            
            
            }
            return li;
    }
} 