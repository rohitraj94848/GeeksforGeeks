//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    vector<int> cppOperators(int A, int B) {
        // code here
        int c = A + B;
        int d = A * B;
        int e, f;

        if (A >= B) {
            e = A - B;
            f = A / B;
        } 
        else 
        {
            e = B - A;
            f = B / A;
        }

        return {c, d, e, f};
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int A, B;
        cin >> A >> B;
        Solution ob;
        vector<int> ans = ob.cppOperators(A, B);
        for (int u : ans) cout << u << "\n";
    }
}
// } Driver Code Ends