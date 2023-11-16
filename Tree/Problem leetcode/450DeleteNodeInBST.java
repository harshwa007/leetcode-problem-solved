package Tree.Problem leetcode;

public class 450DeleteNodeInBST {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(key<root.val)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(key>root.val)
        {
            root.right = deleteNode(root.right,key);
        }
        else
        {
            if(root.right == null)
            {
                return root.left;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            root.val = minValue(root.right);
            root.right=deleteNode(root.right,root.val);
        }
        return root;
    }
    static int minValue(TreeNode root)
    {
        int minV = root.val;
        while(root.left!=null)
        {
            minV = root.left.val;
            root = root.left;
        }
        return minV;
    }
}
}
