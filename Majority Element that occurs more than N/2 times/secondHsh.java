
public class secondHsh {
    class Solution {
        static int majorityElement(int a[], int size) {
            // your code here
            HashMap<Integer, Integer> hs = new HashMap<>();
            for (int i = 0; i < a.length; i++) {
                hs.put(a[i], hs.getOrDefault(a[i], 0) + 1);
                if (hs.get(a[i]) > size / 2) {
                    return a[i];
                }

            }
            return -1;
        }
    }
}
