
public class first {
    static int majorityElement(int a[], int size) {
        // your code here

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > size / 2) {
                return a[i];
            }
        }
        return -1;
    }

}
/*
 * Leetcode problem solution Majority Element
 * 
 * class Solution {
 * public int majorityElement(int[] nums) {
 * int count = 0;
 * int candidate = 0;
 * 
 * for (int num : nums) {
 * if (count == 0) {
 * candidate = num;
 * }
 * 
 * if (num == candidate) {
 * count++;
 * } else {
 * count--;
 * }
 * }
 * 
 * return candidate;
 * }
 * }
 */
