//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long lcm = 0, gcd = 0;
        
        if(A == B){
            gcd = A;
        } else {
            long a = A, b = B;
            while(a > 0 && b > 0){
                if(a > b){
                    a%=b;
                }else{
                    b%=a;
                }
            }
            gcd = a == 0 ? b : a;
        }
        
        lcm = gcd > 0 ? (A*B)/gcd : gcd;
        
        return new Long[]{lcm, gcd};
        
    }
};