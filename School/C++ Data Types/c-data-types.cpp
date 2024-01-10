//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    int cppIntType() {

        // code here

        int a;

        cin>>a;

        return a;

        //cout<<a<<"\n";

    }

    

    char cppCharType() {

        // code here

        char c;

        cin>>c;

        return c;

       // cout<<c<<"\n";

    }

    

    float cppFloatType() {

        // code here

        float b;

        cin>>b;

        return b;

       // cout<<b<<"\n";

    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        Solution ob;
        cout << ob.cppIntType() << endl;
        cout << ob.cppCharType() << endl;
        cout << ob.cppFloatType() << endl;
    }
    return 0;
}
// } Driver Code Ends