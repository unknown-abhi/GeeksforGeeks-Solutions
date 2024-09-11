//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline character

        while (t-- > 0) {
            String[] arrInput = sc.nextLine().split(" ");
            int[] arr = new int[arrInput.length];
            for (int i = 0; i < arrInput.length; i++) {
                arr[i] = Integer.parseInt(arrInput[i]);
            }

            int k = Integer.parseInt(sc.nextLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayCount(arr, k));
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int countSubstringsWithAtMostKDistinct(int S[], int K) {
        if (K == 0)
            return 0;

        int[] charCount = new int[1000001];
        int right = 0, left = 0, result = 0, distinctCount = 0;

        while (right < S.length) {
            int rightValue = S[right];
            if (charCount[rightValue] == 0) {
                distinctCount++;
            }
            charCount[rightValue]++;
            right++;

            while (distinctCount > K) {
                int leftValue = S[left];
                charCount[leftValue]--;
                if (charCount[leftValue] == 0) {
                    distinctCount--;
                }
                left++;
            }
            result += (right - left);
        }
        return result;
    }
    
    static int subarrayCount(int arr[], int k) {
        // code here
        return countSubstringsWithAtMostKDistinct(arr, k) - countSubstringsWithAtMostKDistinct(arr, k - 1);
    }
}
