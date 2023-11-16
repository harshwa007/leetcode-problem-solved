package Tree.Problem leetcode;

public class 114.FlattenBTtoLL {
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
    TreeNode head = null;
    public void flatten(TreeNode root) {
        if(root!=null) revPreOrder(root);
    }
    private void revPreOrder(TreeNode node)
    {
        
        if(node.right!=null) revPreOrder(node.right);
        if(node.left!=null) revPreOrder(node.left);
        node.left=null;
        node.right = head;
        head = node;
    }
}
/*
class Solution {
    TreeNode head = null;
    public void flatten(TreeNode root) {
        if (root != null) revPreOrder(root);
    }
    private void revPreOrder(TreeNode node) {
        if (node.right != null) revPreOrder(node.right);
        if (node.left != null) revPreOrder(node.left);
        node.left = null;
        node.right = head;
        head = node;
    }
}
In order to properly connect the linked list, we'll need to start at the bottom and work up. This means that we'll need to move in reverse pre-order traversal order through the binary tree. Since pre-order traversal is normally "node, left, right", we'll have to move in the reverse order of "right, left, node".

Binary tree traversal is prime ground for a recursive solution, so let's define a helper (revPreOrder) for the purpose. We'll also keep a global variable head to keep track of the head of the linked list as we work our way backwards.

Per our reverse pre-order traversal approach, we want to recursively work down the right path first then the left path, if they exist. Once we've flattened the left and right paths recursively, head should at this point be equal to the next node after the current one, so we should set it as node.right. We shouldn't forget to set node.left to null, as well.

Once we're done with the current node, we can update head to node and allow the recursion to complete and move back up to the next layer. Once the recursion stack is exhausted, head will be equal to root again.

Lastly, we have to deal with an edge case of an empty root, so we can just make sure to only call the initial recursion on root if root actually is a node. There is no need for a return statement, because the test suite will evaluate root directly.

Time Complexity: O(N) where N is the number of nodes in the binary tree
Space Complexity: O(N) for the recursion stack, which is as long as the maximum depth of the binary tree, which can go up to N
*/
}
