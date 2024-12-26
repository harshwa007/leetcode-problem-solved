/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

class Node
{
    public:
        int data;
        Node* next;
        Node()
        {
            data = 0;
            next = nullptr;
        }
        Node(int data)
        {
            data = data;
            next = nullptr;
        }
        ~Node()
        {
            
        }
};

class SinglyLinkedList
{
    private:
        Node* head;
    public:
        SinglyLinkedList()
        {
            head = nullptr;
            
        }
        void insertAtHead(int data)
        {
            Node* newNode = new Node(data);
            //base condition
            if(head==NULL)
            {
                head = newNode;
                return;
            }
            head->next = head;
            head = newNode;
        }
        void insertAtPostion(int data,int position)
        {
            if(position==1)
            {
                insertAtHead(data);
                return;
            }
            Node* newNode = new Node(data);
            Node* tmp;
            for(int index=0; index!=position-1 || tmp!=NULL; ++index)
            {
                tmp = tmp->next;
            }

            newNode->next =tmp->next;
            tmp->next = newNode;
        }
        void insertAtLast(int data)
        {
            if(head==NULL)
            {
                insertAtHead(data);
                return;
            }
            Node* tmp = head;
            while(tmp!=NULL)
            {
                tmp = tmp->next;
            }
            Node* newNode = new Node(data);
            tmp->next = newNode;
            //newNode->next = NULL;
        }
        void deleteAtIndex(int position)
        {
            if(head==nullptr)
            {
                std::cout<<"Not able to delete\n";
                return;
            }
            
            //delete head
            if(position==1)
            {
                Node* tmp = head;
                head = head->next;
                delete tmp;
                return;
            }
            Node* tmp = head;
            for(int i=1;i!=position-1 || tmp!=NULL; ++i )
            {
                tmp = tmp->next;
            }
            if(tmp==NULL)
            {
                std::cout<<"position not found\n";
            }
            if(tmp->next!=nullptr)
            {
                Node* tmp1 = tmp->next;
                tmp->next = tmp->next->next;
                delete tmp1;
                return;
            }
        }
        void Print()
        {
            Node* tmp=head;
            while(tmp!=nullptr)
            {
                std::cout<<tmp->data<<"->";
                tmp = tmp->next;
            }
            std::cout<<" NULL";
        }
};
int main()
{
    SinglyLinkedList list;
    list.insertAtPostion(10,1);
    list.insertAtHead(5);
    list.insertAtHead(5);
    list.Print();
    return 0;
}
