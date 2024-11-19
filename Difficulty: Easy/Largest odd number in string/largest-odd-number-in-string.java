//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String s) {
        // code here
        int startIdx = 0;
        int endIdx = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '0') {
                startIdx = i;
                break;
            }
        }

        int oddCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                endIdx = i;
                oddCount++;
                break;
            }
        }

        if (oddCount > 0) {
            oddCount = 1;
        }

        return s.substring(startIdx, endIdx + oddCount);
    }
}