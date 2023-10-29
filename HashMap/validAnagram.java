// 
// LeetCode Some TestCAse Passed
//class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashSet<String> hs1 = new HashSet<>(s.length());
//         HashSet<String> hs2 = new HashSet<>(t.length());
//         if(s.length()!=t.length())
//         {
//             return false;
//         }
//         if(s.length()==1 && t.length()==1)
//         {
//             return s.equals(t);
//         }
//         for(int i=0;i<s.length()-1;i++)
//         {
//             hs1.add(s.substring(i,i+1));
//         }
//         for(int j=0;j<t.length()-1;j++)
//         {
//             hs2.add(t.substring(j,j+1));
//         }
//         for(String val:hs1)
//         {
//             if(!hs2.contains(val))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
/* GeeksforGeek
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
         
        // Your code here
        HashMap<Character,Integer>h1 = new HashMap<>(); 
        HashMap<Character,Integer>h2 = new HashMap<>(); 
        char[] aarray=a.toCharArray();
        char[] barray=b.toCharArray();
        for(char c:aarray)
        {
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c:barray)
        {
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        return h1.equals(h2);
        
        
        
    }
}
*/class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>h1 = new HashMap<>(); 
        HashMap<Character,Integer>h2 = new HashMap<>(); 
        char[] aarray=s.toCharArray();
        char[] barray=t.toCharArray();
        for(char c:aarray)
        {
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c:barray)
        {
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        return h1.equals(h2);
    }
}
