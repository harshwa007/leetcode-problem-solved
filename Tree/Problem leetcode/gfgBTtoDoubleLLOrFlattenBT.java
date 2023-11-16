package Tree.Problem leetcode;

public class gfgBTtoDoubleLLOrFlattenBT {
class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    //Link: https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
    Node prev=null,head=null;
    Node bToDLL(Node root)
    {
	//  Your code here	
	if(root==null) return null;
	bToDLL(root.left);
	if(prev==null) head=root;
	else
	{
	    root.left = prev;
	    prev.right = root;
	}
	prev = root;
	bToDLL(root.right);
	return head;
	
    }
}
}
