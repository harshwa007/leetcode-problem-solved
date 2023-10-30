class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        for(int i=num.length()-1;i>=0;i--)
        {
            int odd=(int) num.charAt(i)-'0';
            if(odd%2!=0)
            {
                ans=ans+num.substring(0,i+1);
                break;
            }
        }
        return ans;
    }
}
