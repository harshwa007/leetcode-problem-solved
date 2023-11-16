package Tree.Problem leetcode;

public class gfgBurnTree {
    class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    //wraprer class for depth so that it can not change value unless we updated
    static class Depth
    {
        int d;
        public Depth(int d)
        {
            this.d=d;
        }
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        Depth depth=new Depth(-1);
        burn(root,target,depth);
        return ans; //maximum time by adding subtree height and depth from root node and leaf node +1
        
    }
    static int ans = -1;
    public static int burn(Node root, int target, Depth depth)
    {
        if(root==null) return 0;
        // if(root.data==target)
        // {
        //     depth.d=1;
        //     return 1;
        // }
        Depth ld = new Depth(-1);
        Depth rd = new Depth(-1);
        
        int lh = burn(root.left,target,ld); // calculate left subtree maximum height and for right as well
        int rh = burn(root.right,target,rd);
        
        if(ld.d!=-1)
        {
            ans = Math.max(ans,ld.d+1+rh); 
            depth.d = ld.d+1;
        }
        else if(rd.d!=-1)
        {
            ans = Math.max(ans, rd.d+1+lh);
            depth.d = rd.d+1;
        }
        if(root.data==target)
        {
            depth.d=0;
            ans=Math.max(rh,lh);
        }
        return Math.max(lh,rh) +1; // return calculated maximum left/right subtree height
    }
}
}
