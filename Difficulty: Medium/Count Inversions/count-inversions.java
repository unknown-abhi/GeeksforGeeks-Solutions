//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    long count = 0;
    
    void merge(long arr[], int start, int mid, int end){
        
        List<Long> newArr = new ArrayList<>();
        
        int left = start;
        int right = mid + 1;
        
        while(left <= mid && right <= end){
            
            if(arr[left] <= arr[right]){
                newArr.add(arr[left]);
                left++;
            }else{
                newArr.add(arr[right]);
                count += (mid - left) + 1;
                right++;
            }
        }
        
        while(left <= mid){
            newArr.add(arr[left]);
            left++;
        }
        
        while(right <= end){
            newArr.add(arr[right]);
            right++;
        }
        
        for (int i = start; i <= end; i++) {
            arr[i] = newArr.get(i - start);
        }
        
    }
    
    void divide(long arr[], int start, int end){
        
        //base case
        if(start >= end){
            return;
        }
        
        int mid = (start + end)/2;
        
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        merge(arr, start, mid, end);
        
    }
    
    long inversionCount(long arr[], int n) {
        // Your Code Here0
        divide(arr, 0, n - 1);
        
        return count;
    }
}