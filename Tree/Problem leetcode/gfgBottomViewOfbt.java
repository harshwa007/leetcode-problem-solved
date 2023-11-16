package Tree.Problem leetcode;

public class gfgBottomViewOfbt {
class Solution
{
    //link https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<Pair> q =new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair curr = q.poll();
            // let map to update its key so that we will get bottom element
            map.put(curr.hd,curr.node.data);
            if(curr.node.left!=null)
            {
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null)
            {
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(map.values());
        return ans;
    }
    static class Pair
    {
        int hd;
        Node node;
        public Pair(int hd,Node node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
}
}
