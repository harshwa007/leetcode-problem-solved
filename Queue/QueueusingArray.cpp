#include <iostream>
#define SIZE 10
using namespace std;
class Queue
{
    private:
        int arr[SIZE];
        int front;
        int rear;
    public:
        Queue()
        {
            front = -1;
            rear = -1;
        }
        bool isFull()
        {
            return rear==SIZE-1;
        }
        bool isEmpty()
        {
            return front==-1;
        }
        bool enqueue(int data)
        {
            if(isFull())
            {
                return false;
            }
            else if(front==-1)
            {
                ++front;
                ++rear;
                arr[rear] = data;
                return true;
            }
            else
            {
                ++rear;
                arr[rear] = data;
                return true;
            }
        }
        int dequeue()
        {
            if(isEmpty())
            {
                cout<<"Queue is isEmpty..! elements can not be deleted..!";
                return -1;
            }
            else 
            {
                int element = arr[front];
                if(front>=rear)
                {
                    front = -1;
                    rear = -1;                  
                }
                else
                {
                    ++front;
                }
                return element;
            }
        }
        int size()
        {
            if(isEmpty())
            {
                return 0;
            }
            return rear - front + 1;
        }
        void Display()
        {
            for(int index = front; index<=rear; ++index)
            {
                cout<<arr[index]<<" ";
            }
        }
};
int main()
{
    Queue q;
    q.enqueue(5);
    q.enqueue(3);
    q.enqueue(14);
    q.enqueue(23);
    q.Display();
    while(!q.isEmpty())
    {
        int data = q.dequeue();
        cout<<data<<" removed from queue\n";
    }
    q.Display();
    return 0;
}
