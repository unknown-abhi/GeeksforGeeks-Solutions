//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution {
    static boolean armstrongNumber(int n){
        // code here
        int ans = 0;

        int originalNumber = n;

        int countDigit = (int) Math.log10(n) + 1; // Constant TC

        while(n != 0){
            int digit = n%10;
            ans += Math.pow(digit, countDigit);
            n /= 10;
        }

        return originalNumber == ans;
        }
}