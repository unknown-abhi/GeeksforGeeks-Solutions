//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int start = 0;
        int end = arr.size() - 1; // Use size() method for List
        
        int ans = 0; // Initialize ans as an integer
        
        while (start <= end) {
            int mid = (start + end) / 2;
    
            if (mid < end && arr.get(mid) > arr.get(mid + 1)) {
                ans = mid + 1; // mid + 1 is the rotation point
                break; // break out of the loop once rotation point is found
            }
            if (mid > start && arr.get(mid) < arr.get(mid - 1)) {
                ans = mid; // mid is the rotation point
                break; // break out of the loop once rotation point is found
            }
    
            if (arr.get(start) < arr.get(mid)) {
                start = mid + 1; // search in the right half
            } else {
                end = mid - 1; // search in the left half
            }
        }
    
        return ans;
    }
}