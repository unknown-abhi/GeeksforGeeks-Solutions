//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here zero = new Node();
        if (head == null || head.next == null) {
        return head;
    }

    // Initialize dummy nodes for 0s, 1s, and 2s
    Node zero = new Node(-1);
    Node one = new Node(-1);
    Node two = new Node(-1);

    Node zeroTail = zero, oneTail = one, twoTail = two;
    Node mover = head;

    // Traverse the list once
    while (mover != null) {
        if (mover.data == 0) {
            zeroTail.next = mover;
            zeroTail = zeroTail.next;
        } else if (mover.data == 1) {
            oneTail.next = mover;
            oneTail = oneTail.next;
        } else {
            twoTail.next = mover;
            twoTail = twoTail.next;
        }
        mover = mover.next;
    }

    // Connect the three lists
    zeroTail.next = (one.next != null) ? one.next : two.next;
    oneTail.next = two.next;
    twoTail.next = null; // Important to terminate the last node

    return zero.next; // Returning the head of the modified list
    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends