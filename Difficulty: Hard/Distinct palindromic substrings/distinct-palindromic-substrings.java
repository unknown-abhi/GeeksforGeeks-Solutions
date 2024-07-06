//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str = read.readLine().trim(); 
            Solution obj = new Solution();
            int ans = obj.palindromeSubStrs(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    int palindromeSubStrs(String s) { 
        // code here 
        Set<String> st = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            // Odd
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                st.add(s.substring(left, right + 1));
                left--;
                right++;
            }
            left = i;
            right = i+1;
            // Even
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                st.add(s.substring(left, right + 1));
                left--;
                right++;
            }
        }
        
        return st.size();
    }
} 