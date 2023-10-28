class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        sb.append(s);
        int k=s.length();
        for(int i=0;i<=s.length();i++)
        {
            if(sb.substring(i,k).equals(goal))
            {
                return true;
            }
            k++;
        }
        return false;

    }
}
