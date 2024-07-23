//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int nums1[], int nums2[], int size1, int size2, int k) {
        
        int newSize = size1 + size2;

        int[] ans = new int[newSize];

        int i = 0, j = 0, flag = 0;

        while (i < size1 && j < size2) {

            if (nums1[i] <= nums2[j]) {
                ans[flag] = nums1[i];
                i++;
                flag++;
            } else {
                ans[flag] = nums2[j];
                j++;
                flag++;
            }
        }

        while (i < size1) {
            ans[flag] = nums1[i];
            i++;
            flag++;
        }

        while (j < size2) {
            ans[flag] = nums2[j];
            j++;
            flag++;
        }
        
        return (long) (ans[k-1]);
    }
}