class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int c=0;c<s.length();c++)
        {
            if(s.charAt(c)=='(')
            {
                if(st.size()>=1)
                {
                    str.append(s.charAt(c));
                }
                st.push(s.charAt(c));
            }
            else
            {
                if(st.size()>1)
                {
                    str.append(s.charAt(c));
                }
                st.pop();
            }
        }

    return str.toString();
    }
}
/*

static String removeOuterParentheses(String S)
{
  // Stores the resultant 
  // string
  String res = "";
 
  // Stores the count of
  // opened parentheses
  int count = 0;
 
  // Traverse the string
  for (int c = 0; 
           c < S.length(); c++) 
  {
    // If opening parentheses is
    // encountered and their
    // count exceeds 0
    if (S.charAt(c) == '(' && 
        count++ > 0)
 
      // Include the character
      res += S.charAt(c);
 
    // If closing parentheses is
    // encountered and their
    // count is less than count
    // of opening parentheses
    if (S.charAt(c) == ')' && 
        count-- > 1)
 
      // Include the character
      res += S.charAt(c);
  }
 
  // Return the resultant string
  return res;
}
*/
