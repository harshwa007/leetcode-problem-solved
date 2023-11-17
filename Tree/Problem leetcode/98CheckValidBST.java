package Tree.Problem leetcode;

public class 98CheckValidBST {
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
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
       if(root!=null)
       {
           //if not satifying for left subtree return false
           if(!isValidBST(root.left))
           {
               return false;
           }
           // if prev is greater than current return false
           if(prev!=null && prev.val>=root.val)
           {
               return false;
           }
           //update prev node
           prev = root;
            // call for right subtree
           return isValidBST(root.right);
       } 
       return true; // if root is null return true
    }



}
}
