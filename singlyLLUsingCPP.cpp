/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
/*
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
*/
#include <iostream>

class Node {
public:
    int data;
    Node* next;

    Node() {
        data = 0;
        next = nullptr;
    }

    Node(int data) {
        this->data = data; // Use this-> to refer to the member variable
        next = nullptr;
    }

    ~Node() {}
};

class SinglyLinkedList {
private:
    Node* head;

public:
    SinglyLinkedList() {
        head = nullptr;
    }

    void insertAtHead(int data) {
        Node* newNode = new Node(data);
        newNode->next = head; // Set newNode's next to current head
        head = newNode; // Update head to newNode
    }

    void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtHead(data);
            return;
        }

        Node* newNode = new Node(data);
        Node* tmp = head;

        // Traverse to the node just before the desired position
        for (int index = 1; index < position - 1 && tmp != nullptr; ++index) {
            tmp = tmp->next;
        }

        // If tmp is nullptr, the position is out of bounds
        if (tmp == nullptr) {
            std::cout << "Position not found\n";
            delete newNode; // Clean up the new node if position is invalid
            return;
        }

        newNode->next = tmp->next; // Link newNode to the next node
        tmp->next = newNode; // Link the previous node to newNode
    }

    void insertAtLast(int data) {
        if (head == nullptr) {
            insertAtHead(data);
            return;
        }

        Node* tmp = head;
        while (tmp->next != nullptr) { // Traverse until the last node
            tmp = tmp->next;
        }

        Node* newNode = new Node(data);
        tmp->next = newNode; // Link the new node at the end
    }

    void deleteAtIndex(int position) {
        if (head == nullptr) {
            std::cout << "Not able to delete, list is empty\n";
            return;
        }

        // Delete head
        if (position == 1) {
            Node* tmp = head;
            head = head->next;
            delete tmp;
            return;
        }

        Node* tmp = head;
        for (int i = 1; i < position - 1 && tmp != nullptr; ++i) {
            tmp = tmp->next;
        }

        // If tmp is nullptr or tmp->next is nullptr, the position is out of bounds
        if (tmp == nullptr || tmp->next == nullptr) {
            std::cout << "Position not found\n";
            return;
        }

        Node* tmp1 = tmp->next;
        tmp->next = tmp->next->next; // Bypass the node to be deleted
        delete tmp1; // Delete the node
    }

    void Print() {
        Node* tmp = head;
        while (tmp != nullptr) {
            std::cout << tmp->data << " -> ";
            tmp = tmp->next;
        }
        std::cout << "NULL" << std::endl; // Print NULL at the end
    }
    
    void ReverseLL()
    {
        Node* prev = nullptr;
        Node* curr = head;
        Node* next = nullptr;
        while(curr!=nullptr)
        {
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
};
//If you want external function to ReverseLL
// Node* ReverseLL(Node* head)
// {
//     Node* prev = nullptr;
//     Node* curr = head;
//     Node* next = nullptr;
//     while(curr!=nullptr)
//     {
//         next = curr->next;
//         curr->next = prev;
//         prev = curr;
//         curr = next;
//     }
//     return prev;
// }
int main() {
    SinglyLinkedList list;
    list.insertAtPosition(10, 1);
    list.insertAtLast(11);
    list.insertAtLast(13);
    list.insertAtLast(16);
    list.Print(); // Should print: 10 -> 11 -> 13 -> 16 -> NULL

    list.deleteAtIndex(1); // Delete the head
    list.Print(); // Should print: 11 -> 13 -> 16 -> NULL
    list.deleteAtIndex(2);
    list.Print();
    list.insertAtPosition(18,3);
    list.insertAtPosition(9,1);
    list.Print();
    list.ReverseLL();
    list.Print();
}
