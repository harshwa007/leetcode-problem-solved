
public class third_moore_voting_algo {
    class Solution {
        static int majorityElement(int a[], int size) {
            // your code here
            int count = 0;
            int element = 0;

            for (int i = 0; i < a.length; i++) {
                if (count == 0) {
                    element = a[i];
                    count = 1;
                } else if (element == a[i]) {
                    count++;
                } else {
                    count--;
                }
            }
            int ncount = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == element) {
                    ncount++;
                }
            }
            if (ncount > size / 2) {
                return element;
            } else {
                return -1;
            }
        }
    }
}
