// User function Template for Java

class Solution {

     Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        int[] oldNum = num.clone();
        mirror(num, n);

        if (isGreater(num, oldNum, n)) {
            return toVector(num);
        }

        int carry = 1;
        int mid = (n - 1) / 2;

        while (mid >= 0 && carry > 0) {
            int val = (num[mid] + carry);
            carry = val / 10;
            num[mid] = val % 10;
            mid--;
        }

        if (carry > 0) {
            Vector<Integer> v = new Vector<Integer>();
            v.add(1);
            for (int i = 0; i < n - 1; i++) {
                v.add(0);
            }
            v.add(1);
            return v;
        }

        mirror(num, n);
        return toVector(num);
    }

    boolean isGreater(int num[], int oldNum[], int n) {
        for (int i = 0; i < n; i++) {
            if (num[i] > oldNum[i]) {
                return true;
            } else if (num[i] < oldNum[i]) {
                return false;
            }
        }
        return false;
    }

    Vector<Integer> toVector(int num[]) {
        Vector<Integer> v = new Vector<Integer>();
        for (int value : num) {
            v.add(value);
        }
        return v;
    }

    void mirror(int num[], int n) {
        int i = 0;
        int j = n - 1;

        while (i < j) {
            num[j] = num[i];
            i++;
            j--;
        }
    }
}