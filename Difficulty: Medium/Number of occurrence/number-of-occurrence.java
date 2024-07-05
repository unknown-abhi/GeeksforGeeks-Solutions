//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    
    public int leftSide(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int leftCount = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                leftCount = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return leftCount;
    }

    public int rightSide (int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int rightCount = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                rightCount = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return rightCount;
    }
    
    int count(int[] arr, int n, int x) {
        // code here
        int first = leftSide(arr, x);
        
        if(first == -1){
            return 0;
        }
        
        return rightSide(arr, x) - first + 1;
    }
}