//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.pairWithMaxSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static long pairWithMaxSum(long nums[], long N)
    {
        // Your code goes here
        long sum = 0L, maxSum = Long.MIN_VALUE;
        long count = 0L;
        for (int i = 0; i < N; i++) {

            sum += nums[i];
            count++;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (count == 2) {
                count = 0;
                sum = 0;
                i--;
            }
        }

        return maxSum;
    }
}