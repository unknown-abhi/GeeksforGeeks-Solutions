//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends




/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.empty() || s.size() == 1) {
            return s;
        }

        int tmp = s.pop();
        sort(s);
        insertAtCorrectPosition(s, tmp);

        return s;
    }

    private static void insertAtCorrectPosition(Stack<Integer> s, int tmp) {
        if (s.empty() || s.peek() <= tmp) {
            s.push(tmp);
            return;
        }
        int popped = s.pop();
        insertAtCorrectPosition(s, tmp);
        s.push(popped);
    }
}