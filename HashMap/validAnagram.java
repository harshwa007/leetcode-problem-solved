class Solution {
    public boolean isAnagram(String s, String t) {
        HashSet<String> hs1 = new HashSet<>(s.length());
        HashSet<String> hs2 = new HashSet<>(t.length());
        if(s.length()!=t.length())
        {
            return false;
        }
        if(s.length()==1 && t.length()==1)
        {
            return s.equals(t);
        }
        for(int i=0;i<s.length()-1;i++)
        {
            hs1.add(s.substring(i,i+1));
        }
        for(int j=0;j<t.length()-1;j++)
        {
            hs2.add(t.substring(j,j+1));
        }
        for(String val:hs1)
        {
            if(!hs2.contains(val))
            {
                return false;
            }
        }
        return true;
    }
}
