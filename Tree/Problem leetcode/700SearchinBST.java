package Tree.Problem leetcode;

public class 700SearchinBST {
    class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;
        if(curr==null) return null;
        if(curr.val==val) return curr;
        if(curr.val>val)
        {
            return searchBST(curr.left,val);
        }
        return searchBST(curr.right,val);
    }
}
//gfg
/*
 * class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root==null) return false;
        if(root.data==x) return true;
        if(root.data>x)
        {
            return search(root.left,x);
        }
        return search(root.right,x);
    }
}
 */
}
