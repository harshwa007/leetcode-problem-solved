class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int ans = -1;
        while(root!=null)
        {
            if(root.data==x)
            {
                return root.data;
            }
            if(root.data>x)
            {
                root = root.left;
            }
            else
            {
                ans = root.data;
                root = root.right;
            }
            
        }
        return ans;
    }
}
