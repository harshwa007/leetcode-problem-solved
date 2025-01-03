class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int ans = -1;
        while(root!=null)
        {
            if(root.data==key)
            {
                return root.data;
            }
            if(root.data>key)
            {
                ans = root.data;
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }
        return ans;
    }
}
