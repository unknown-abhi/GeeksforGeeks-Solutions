//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
        switch (str.toLowerCase()) {
            case "integer":
                return Integer.BYTES;
            case "character":
                return 1;
            case "byte":
                return Byte.BYTES;
            case "short":
                return Short.BYTES;
            case "long":
                return Long.BYTES;
            case "float":
                return Float.BYTES;
            case "double":
                return Double.BYTES;
            default:
                return -1;
        }
    }
}