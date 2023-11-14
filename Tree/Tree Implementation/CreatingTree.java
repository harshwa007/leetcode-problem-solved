import java.util.Scanner;
class CreatingTree
{   static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=createTree();
        System.out.println("Root node: "+root.data);
    }
    public static class Node
    {
        Node right,left;
        int data;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static Node createTree()
    {
        Node root=null;
        System.out.println("Enter Data");
        int data = sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for"+data);
        root.left=createTree();
        System.out.println("Enter right for"+data);
        root.right=createTree();
        return root;
    }




}