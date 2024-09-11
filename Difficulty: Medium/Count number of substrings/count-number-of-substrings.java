//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long countSubstringsWithAtMostKDistinct(String S, int K){
        if (K == 0)
            return 0;

        int[] charCount = new int[26];
        int right = 0, left = 0, result = 0, distinctCount = 0;

        while (right < S.length()) {
            char rightValue = S.charAt(right);
            if (charCount[rightValue - 'a'] == 0) {
                distinctCount++;
            }
            charCount[rightValue - 'a']++;
            right++;

            while (distinctCount > K) {
                char leftValue = S.charAt(left);
                charCount[leftValue - 'a']--;
                if (charCount[leftValue - 'a'] == 0) {
                    distinctCount--;
                }
                left++;
            }
            result += (right - left);
        }
        return result;
    }
    
    long substrCount (String S, int K) {
        // your code here
        return countSubstringsWithAtMostKDistinct(S, K) - countSubstringsWithAtMostKDistinct(S, K - 1);
        
    }
}