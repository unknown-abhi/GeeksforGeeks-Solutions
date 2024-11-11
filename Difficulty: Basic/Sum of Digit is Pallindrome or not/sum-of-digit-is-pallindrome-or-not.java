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
            System.out.println(ob.isDigitSumPalindrome(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        
        while(n != 0){
            sum += (n%10);
            n /= 10;
        }
        
        int reverse = 0;
        int original = sum;

        while(sum > 0){
            int rem = sum%10;
            reverse = (reverse * 10) + rem;
            sum /= 10;
        }

        return (original == reverse) ? 1 : 0;
    }
}