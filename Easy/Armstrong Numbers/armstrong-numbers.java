//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int originalNumber = n;

        int once = n % 10;
        n /= 10;
        int tens = n % 10;
        n /= 10;
        int hundred = n % 10;
        
        return (originalNumber == ((Math.pow(hundred, 3) + Math.pow(tens, 3) + Math.pow(once, 3)))) ? "Yes" : "No";
    }
}