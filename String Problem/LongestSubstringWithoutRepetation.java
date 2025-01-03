//Problem No 3-> 340 test case passed
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        for(char c: s.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c);
            }
            else
            {
                length = Math.max(length,set.size());
                set.clear();
                set.add(c);
            }
        }
        return length;
    }
}
