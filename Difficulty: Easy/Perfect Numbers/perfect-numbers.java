//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if (N == 1) {
            return 0;
        }

        long sum = 1;
        long div = 2;

        while (div <= Math.sqrt(N)) {
            if (N % div == 0) {
                sum += div;

                if (div != N / div) {
                    sum += N / div;
                }
            }
            div++;
        }

        return (sum == N) ? 1 : 0;
    }
};