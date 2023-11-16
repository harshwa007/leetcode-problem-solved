package Tree.Problem leetcode;

public class gfgTopViewOfBT {
/*
//link https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        //ArrayList<Integer> ans = 
        // if(root==null)
        // {
        
        // }
        Queue<Pair> q =new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd,curr.node.data);
            }
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
