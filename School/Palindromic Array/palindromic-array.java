//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG {
    public static int palinArray(int[] a, int n) {
        // Iterate through the array and check if each element is a palindrome
        for (int i = 0; i < n; i++) {
            if (isPalindrome(a[i]) == 0) {
                return 0; // Not a palindrome
            }
        }
        return 1; // All elements are palindromes
    }

    static int isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 0; // Not a palindrome
            }
            left++;
            right--;
        }
        return 1; // Palindrome
    }
}
