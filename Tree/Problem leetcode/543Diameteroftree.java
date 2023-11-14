package Tree.Problem leetcode;

public class 543Diameteroftree {
    class Solution {
    //DFS ALGO
    // declare len field to store maximum length
    int len=0;
    // declare recursive function dfs that takes nodes:
    public int height(TreeNode root)
    {
        // if no node then we at the leaf and return 0
        if(root==null) return 0;
        // declare left varibale that will hold len of left traversal and traverse left
        int leftHeight=height(root.left);
        // declare right varibale that will hold len of right traversal and traverse right
        int rightHeight=height(root.right);
         // find current maximum length of left and right traversal and current max length, set max length as new len
        len = Math.max(len,leftHeight+rightHeight);
          // return max of left or right lengths + 1
        return Math.max(leftHeight,rightHeight)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        // call dfs function with root
        height(root);
        // return max length
        return len;
    }
}
}
