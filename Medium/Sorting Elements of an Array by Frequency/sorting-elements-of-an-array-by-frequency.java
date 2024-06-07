/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void sortElementByFrequency(int[] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Integer> newArr = new ArrayList<>();

        int mpSize = mp.size();

        for (int i = 0; i < mpSize; i++) {
            int maxNum = Integer.MIN_VALUE;
            int maxCount = Integer.MIN_VALUE;

            for (int j : mp.keySet()) {
                if (mp.get(j) > maxCount) {
                    maxNum = j;
                    maxCount = mp.get(j);
                }
            }

            for (int k = 0; k < maxCount; k++) {
                // newArr.add(maxNum);
                System.out.print(maxNum+" ");
            }

            mp.remove(maxNum);
        }
        // System.out.println(newArr);
    }
    
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc-- > 0){
		    int size = sc.nextInt();
		    int[] arr = new int[size];
		    for(int i = 0; i < size; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    sortElementByFrequency(arr);
		    System.out.println();
		}
	}
}