/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include<stack>
using namespace std;
class TreeNode
{
    public:
        int data;
        TreeNode* left;
        TreeNode* right;
        TreeNode(int p_data=0)
        {
            data = p_data;
            left = nullptr;
            right = nullptr;
        }
};

class BinaryTree
{
    private:
        TreeNode* root;
        
        TreeNode* insertNode(TreeNode* node, int value)
        {
            if (node == nullptr)
            {
                return new TreeNode(value);
            }
            else if (value < node->data) 
            {
                node->left = insertNode(node->left, value);
            }
            else
            {
                node->right = insertNode(node->right, value);
            }
            return node;
        }
        
        void inorderTraversal(TreeNode* node)
        {
            if(node!=nullptr)
            {
                inorderTraversal(node->left);
                cout<<node->data<<",";
                inorderTraversal(node->right); 
            }
        }
        
        //get top elememt ->pop-> Print-> add right->add left ->repeat 
        void preOrderTraversalUsingStack(TreeNode* node)
        {
            if(node==nullptr)
                return;
            std::stack<TreeNode*> Stack;
            Stack.push(node);
            while(!Stack.empty())
            {
                TreeNode* current = Stack.top();
                Stack.pop();
                cout<<current->data<<",";
                if(current->left!=nullptr)
                {
                    Stack.push(current->right);
                }
                if(current->right!=nullptr)
                {
                    Stack.push(current->left);
                }
            }
        }
        void preorderTraversal(TreeNode* node)
        {
            if(node!=nullptr)
            {
                cout<<node->data<<",";
                preorderTraversal(node->left);
                preorderTraversal(node->right);
            }
        }
        
        void postorderTraversal(TreeNode* node)
        {
            if(node!=nullptr)
            {
                postorderTraversal(node->left);
                postorderTraversal(node->right);
                cout<<node->data<<",";
            }
        }
        
        //Find Minimum value Node
        TreeNode* findMinNode(TreeNode* node)
        {
            if(node->left!=nullptr)
            {
                node = node->left;
            }
            return node;
        }
        TreeNode* deleteNode(TreeNode* node, int data)
        {
            if(node==nullptr)
            {
                return node;
            }
            //Find node that matches data
            if(data < node->data)
            {
                node->left = deleteNode(node->left,data);
            }
            else if(data > node->data)
            {
                node->right = deleteNode(node->right,data);
            }
            //If Node is matched with data
            else
            {
                //If node is leaf node or it has only one child node
                if(node->left==nullptr)
                {
                    TreeNode* temp = node->right;;
                    delete node;
                    return temp;
                }
                else if(node->right==nullptr)
                {
                    TreeNode* temp = node->left;
                    delete node;
                    return temp;
                }
                //If node has 2 child node ! use rigth child of left leaf node to replace with it
                else
                {
                    TreeNode* temp = findMinNode(node->right);
                    //store right child of left node data to node
                    node->data = temp->data;
                    //Delete right child of left node data to node
                    node->right = deleteNode(node->right, temp->data);
                }
            }
            return node;
        }
        void destroyTree(TreeNode* node)
        {
            if(node!=nullptr)
            {
                destroyTree(node->left);
                destroyTree(node->right);
                delete node;
            }
        }
        
    public:
        BinaryTree()
        {
            root = nullptr;
        }
        ~BinaryTree()
        {
            destroyTree(root);
        }
        void insert(int data)
        {
            root = insertNode(root,data);            
        }
        void InOrder()
        {
            cout<<"InOrder Traversal: ";
            inorderTraversal(root);
            cout<<"\n";
        }
        void PreOrder()
        {
            cout<<"Pre Order Traversal: ";
            preorderTraversal(root);
            cout<<"\n";
        }
        void PostOrder()
        {
            cout<<"Post Order Traversal: ";
            postorderTraversal(root);
            cout<<"\n";
        }
        void PreOrderUsingStack()
        {
            cout<<"PreOrder Using Stack: ";
            preOrderTraversalUsingStack(root);
            cout<<"\n";
        }
        void deleteTreeNode(int data)
        {
            root = deleteNode(root, data);
        }
    
};
int main()
{
    BinaryTree tree;
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);
    tree.InOrder();
    tree.PreOrder();
    tree.PreOrderUsingStack();
    tree.PostOrder();
    tree.deleteTreeNode(8);
    tree.PreOrder();
    tree.deleteTreeNode(5);
    tree.PreOrder();
    tree.PreOrderUsingStack();
    return 0;
}
