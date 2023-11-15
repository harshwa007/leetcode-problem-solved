package Tree.Problem leetcode;

public class RightTreeView {
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list1 = new ArrayList<>();
            //ArrayList<TreeNode> list = new ArrayList<>();
            getAllRightNode(root,list1,0);
            // for(TreeNode curr:list)
            // {
            //     ans.add(curr.val);
            // }
            return list1;
        }
        public void getAllRightNode(TreeNode root, List list,int level)
        {
            if(root==null) return;
            if(level == list.size())
            {
                list.add(root.val);
            }
            getAllRightNode(root.right,list,level+1);
            getAllRightNode(root.left,list,level+1);
        }
    }
}
