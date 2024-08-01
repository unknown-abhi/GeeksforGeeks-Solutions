//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        // code here
        int maxRowNo = 0, index = -1;
        
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int low = 0;
            int high = arr[i].length - 1;
            
            while(low <= high){
                int mid = (low + high)/2;
                
                if(arr[i][mid] == 1){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            
            count = arr[i].length - low;
            
            
            // for(int j = 0; j < arr[i].length; j++){
                
            //         count += arr[i][j];
            // }
            
            if(count > maxRowNo){
                maxRowNo = count;
                index = i;
            }
        }
        
        return index;
    }
}