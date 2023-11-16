package Tree.Problem leetcode;

public class 701InsertIntoBST {
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        TreeNode parent=null;
        TreeNode curr = root;
        //copying data into parent and curr node
        if(root == null)
        {
            root = newNode;
            return root;
        }
        while(curr!=null)
        {
            parent = curr;
            if(val<curr.val)
            {
                curr = curr.left;
            }
            else
            {
                curr = curr.right;
            }
        }
        if(parent == null)
        {
            parent = newNode;
        }
        else if(val<parent.val)
        {
            parent.left = newNode;
        }
        else
        {
            parent.right = newNode;
        }
        return root;
    }
}
}
