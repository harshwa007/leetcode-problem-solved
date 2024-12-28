#include <iostream>

class Node {
public:
    int data;
    Node* prev;
    Node* next;

    Node() {
        data = 0;
        next = nullptr;
        prev = nullptr;
    }

    Node(int data) {
        this->data = data; // Use this-> to refer to the member variable
        next = nullptr;
        prev = nullptr;
    }

    ~Node() {}
};

class DoublyLinkedList {
private:
    Node* head;

public:
    DoublyLinkedList() {
        head = nullptr;
    }

    void insertAtHead(int data) {
        Node* newNode = new Node(data);
        if(head==nullptr)
        {
            head = newNode;
            return;
        }
        newNode->next = head;
        head->prev = newNode;
        head = newNode;
    }

    void insertAtPosition(int data, int position) {
        if(position<1)
        {
            std::cout<<"-1\n";
            return;
        }
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
        
        // Node* tmp2 = tmp->next;
        // tmp->next = newNode;
        // newNode->prev =tmp;
        // newNode->next = tmp2;
        // tmp2->prev = newNode;
        
        newNode->next = tmp->next;
        newNode->prev = tmp;
        if(tmp->next!=nullptr)
        {
            tmp->next->prev = newNode;
        }
        tmp->next = newNode;
    }

    void insertAtLast(int data) {
         Node* newNode = new Node(data);
        if (head == nullptr) {
            head = newNode;
            return;
        }

        Node* tmp = head;
        while (tmp->next != nullptr) 
        { 
            tmp = tmp->next;
        }
        tmp->next = newNode;
       newNode->prev =tmp;
        
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
            head->prev = nullptr;
            delete tmp;
            return;
        }

        Node* tmp = head;
        for (int i = 1; i < position  && tmp != nullptr; ++i) {
            tmp = tmp->next;
        }

        // If tmp is nullptr or tmp->next is nullptr, the position is out of bounds
        if (tmp == nullptr || tmp->next == nullptr) {
            std::cout << "Position not found\n";
            return;
        }

        if(tmp->prev!=nullptr)
        {
            tmp->prev->next = tmp->next;
        }
        if(tmp->next!=nullptr)
        {
            tmp->next->prev = tmp->prev;
        }
        delete tmp;
    }

    void Print() {
        Node* tmp = head;
        while (tmp != nullptr) {
            std::cout << tmp->data << " -> ";
            tmp = tmp->next;
        }
        std::cout << "NULL" << std::endl; // Print NULL at the end
    }
    
    void ReverseDLL()
    {
        Node* Temp = nullptr;
        Node* curr = head;
        while(curr!=nullptr)
        {
            //Store Prev Node
            Temp = curr->prev;
            //sets prev add to next
            curr->prev = curr->next;
            //sets next address to prev i.e  temp
            curr->next = Temp;
            //Move to next Node
            curr = curr->prev;
        }
        //Remember
        if(Temp!=nullptr)
        {
            head = Temp->prev; //last Node Remember step
        }
    }
};
//If you want external function to ReverseLL
// Node* ReverseDD(Node* head)
// {
//     Node* Temp = nullptr;
//     Node* curr = head;
//     while(curr!=nullptr)
//     {
//         //Store Prev Node
//         Temp = curr->prev;
//         //sets prev add to next
//         curr->prev = curr->next;
//         //sets next address to prev i.e  temp
//         curr->next = Temp;
//         //Move to next Node
//         curr = curr->prev;
//     }
//     //Remember
//     if(Temp!=nullptr)
//     {
//         head = Temp->prev; //last Node Remember step
//     }
//     return head;
// }
int main() {
    DoublyLinkedList list;
    list.insertAtPosition(10, 1);
    list.insertAtLast(11);
    list.insertAtLast(13);
    list.insertAtLast(16);
    list.insertAtHead(9);
    list.Print(); // Should print: 10 -> 11 -> 13 -> 16 -> NULL

    list.deleteAtIndex(1); // Delete the head
    list.Print(); // Should print: 11 -> 13 -> 16 -> NULL
    list.deleteAtIndex(2);
    list.Print();
    list.insertAtPosition(18,3);
    list.insertAtPosition(9,1);
    list.Print();
    list.ReverseDLL();
    list.Print();
}
