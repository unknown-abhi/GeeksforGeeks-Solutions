//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int[] count = new int[26];

        // Count occurrence of each character in first string
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        // Decrement the count for each character in the second string
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }

        // Check for count of every character
        for (int i : count) {
            // If the count is not zero
            if (i != 0)
                return false; // Return false
        }

        // Otherwise strings are anagram
        return true;
    }
}