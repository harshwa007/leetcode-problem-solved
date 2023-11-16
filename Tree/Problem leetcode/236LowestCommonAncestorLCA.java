package Tree.Problem leetcode;

public class 236LowestCommonAncestorLCA {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // first condition 
        if(root==null) return null;
        //if found in any first condition immediate return that node
        if(root.val==p.val || root.val == q.val) return root;
        // traverse through right and left subtree
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        //if right is null then ans is in left similary vice versa
        if(right==null)return left;
        if(left==null) return right;
        //if not all satisfy found that node 
        return root;
    }
}
}
