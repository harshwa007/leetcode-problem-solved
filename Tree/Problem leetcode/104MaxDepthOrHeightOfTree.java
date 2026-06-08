104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
 

Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 10

//Height of tree
class Solution {
    public int maxDepth(TreeNode root) {
      if(root==null) return 0;
      return Math.max(maxDepth(root.left),maxDepth(root.right))+1;  
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int height = 0;
        return calculateMaxDepth(root,height);
    }
    private int calculateMaxDepth(TreeNode root, int height)
    {
        if(root == null)
        {
            return height;
        }
        return Math.max(calculateMaxDepth(root.left, height+1),calculateMaxDepth(root.right, height+1));
    }
}
