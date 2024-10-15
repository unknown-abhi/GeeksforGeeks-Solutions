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

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    // Function to reverse the linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node addOne(Node head) {
        // Step 1: Reverse the linked list
        head = reverse(head);
        
        Node current = head;
        int carry = 1; // We need to add 1

        // Step 2: Traverse the reversed list and add the carry
        while (current != null) {
            current.data += carry;
            
            if (current.data < 10) {
                carry = 0; // No further carry needed
                break;
            }

            current.data = 0; // Set current node to 0 and move the carry forward
            current = current.next;
        }

        // Step 3: If carry is still there, it means we need to add a new node
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = null;
            // Attach this new node at the end
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Step 4: Reverse the list back to original order
        return reverse(head);
    }
}
