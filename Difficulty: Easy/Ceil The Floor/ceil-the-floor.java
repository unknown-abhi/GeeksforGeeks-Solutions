//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

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

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        
        int low = 0;
        int high = arr.length - 1;
        
        int lb = -1;
        int ub = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x == arr[mid]) {
                return new Pair(arr[mid], arr[mid]);
                
            } else if (x > arr[mid]) {
                lb = mid;
                low = mid + 1;
            } else {
                ub = mid;
                high = mid - 1;
            }
        }
        
        Pair ansPair = new Pair();
        
        ansPair.floor = (lb > -1) ? arr[lb] : lb;
        ansPair.ceil = (ub > -1) ? arr[ub] : ub;
        
        return ansPair;
    }
}

