//{ Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        let head = new Node(input_ar1[0]);
        let tail = head;
        for(let i=1;i<n;i++){
            tail.next = new Node(input_ar1[i]);
            tail = tail.next;
        }
        let obj = new Solution();
        if(obj.isPalindrome(head)){
            console.log("1");
        }
        else{
            console.log("0");
        }
        
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {Node} head
 * @returns {boolean}
*/

/*
class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    // Function to check whether the list is palindrome.
    isPalindrome(head) {
        // Your code here
        if (head.next == null) {
            return true;
        }
        
        let s1 = this.convertToString(head);
        
        let prev = null;
        let curr = head;
        while (curr) {
            let temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        let s2 = this.convertToString(prev);
        return s1 === s2;
    }
    
    convertToString(head) {
        let s = "";
        let cur = head;
        while (cur != null) {
            s += cur.data.toString();
            cur = cur.next;
        }
        return s;
    }
}
