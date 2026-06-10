102. Binary Tree Level Order Traversal
Hint
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000

--------------------------------------------------------------------------------------

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i< size; ++i)
            {
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left != null)
                {
                    q.offer(node.left);
                }
                if(node.right != null)
                {
                    q.offer(node.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
---------------------------------------------------------------------------------------    

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
/*
 * just reverse order of levels
 * class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(ll);
        return ll;
    }
}
 * 
 * 
 */
