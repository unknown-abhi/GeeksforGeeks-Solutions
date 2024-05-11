//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    ArrayList<Long> arr = new ArrayList<>();
    Long count = 1L, flag = 1L, initial;

    ArrayList<Long> factorialNumbers(long N) {
        // code here
        if (N < count) {
            return arr;
        }
        if (flag == 1) {
            initial = N;
        }
        count = count * flag;
        flag++;

        if (count <= initial) {
            arr.add(count);
        }

        return factorialNumbers(N - 1);
    }
}