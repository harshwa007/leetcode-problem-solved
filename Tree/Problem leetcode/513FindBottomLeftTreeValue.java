package Tree.Problem leetcode;

public class 513FindBottomLeftTreeValue {
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
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getLeftViewList(root,0,list);
        return list.get(list.size()-1);
    }
    public void getLeftViewList(TreeNode root,int level,List list)
    {
       // List<Integer> list = new ArrayList<>();
        if(root==null) return ;
        if(level == list.size())
        {
            list.add(root.val);
        }
        getLeftViewList(root.left,level+1,list);
        getLeftViewList(root.right,level+1,list);
    }
}
}
