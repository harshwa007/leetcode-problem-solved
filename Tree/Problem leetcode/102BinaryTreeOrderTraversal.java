package Tree.Problem leetcode;

public class 102BinaryTreeOrderTraversal {
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return ll;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> arr = new ArrayList<>();
            int level=q.size();
            for(int i=0;i<level;i++)
            {
                TreeNode curr=q.poll();
                arr.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }
            ll.add(arr);
        }
        return ll;
    }
}
