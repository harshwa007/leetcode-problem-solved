
public class sumofsquarenumber {
    class Solution {
        public boolean judgeSquareSum(int c) {
            for (long a = 0; a <= Math.sqrt(c); a++) {
                for (long b = 0; b <= Math.sqrt(c); b++) {
                    long ans = 0;
                    ans = (a * a) + (b * b) - c;
                    if (ans == 0) {
                        return true;
                    }
                }
            }
            return false;

            // HashSet<Integer> hs=new HashSet<>();
            // for(int i=0;i<=Math.sqrt(c);i++)
            // {
            // hs.add(i*i);
            // if(hs.contains(c-i*i))
            // {
            // return true;
            // }
            // }
            // return false;
            // long left = 0, right = (long) Math.sqrt(c);
            // while (left <= right) {
            // long cur = left * left + right * right;
            // if (cur < c) {
            // left++;
            // } else if (cur > c) {
            // right--;
            // } else {
            // return true;
            // }
            // }
            // return false;
        }
    }
}
