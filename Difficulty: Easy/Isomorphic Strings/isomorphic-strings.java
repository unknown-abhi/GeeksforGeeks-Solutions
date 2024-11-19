//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s, String t) {
        // Your code here
         // Arrays to store the last seen positions of characters in s and t
        int[] m1 = new int[256], m2 = new int[256];
        
        // Length of the string
        int n = s.length();
        
        // Iterate through each character in the strings
        for (int i = 0; i < n; ++i) {
            // If the last seen positions of the current characters don't match, return false
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            
            // Update the last seen positions
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        
        // If all characters match, return true
        return true;
    }
}