package Tree.Problem leetcode;
//222Count Complete Tree Nodes

public class 222CountCompleteTreeNodes {
    class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
}
