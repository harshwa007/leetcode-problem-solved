/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        if(l1==nullptr && l2==nullptr)
        {
            return nullptr;
        }
        
        ListNode* dummy = new ListNode();
        ListNode* temp = dummy;
        int carry = 0;
        while(l1!=nullptr || l2 !=nullptr || carry)
        {
            int sum = 0;
            if(l1!=nullptr)
            {
                sum+=l1->val;
                l1 = l1->next;
            }
            if(l2!=nullptr)
            {
                sum+=l2->val;
                l2 = l2->next;
            }
            sum +=carry;
            carry = sum/10;
            ListNode* node = new ListNode(sum%10);
            temp->next = node;
            temp = temp->next;
        }
        return dummy->next;
        // int temp1 = 0;
        // int temp2 = 0;
        // int tenThMultipiler=0;
        // ListNode* curr=l1;
        // while(curr!=nullptr)
        // {
        //     temp1 +=curr->val*std::pow(10,tenThMultipiler);
        //     ++tenThMultipiler;
        //     curr = curr->next;
        // }
        // curr = l2;
        // tenThMultipiler = 0;
        // while(curr!=nullptr)
        // {
        //     temp2 +=curr->val*std::pow(10,tenThMultipiler);
        //     ++tenThMultipiler;
        //     curr = curr->next;
        // }
        // temp1 = temp1+temp2;
        // ListNode* head = new ListNode(temp1%10);
        // while(temp!=0)
        // {
        //     temp1/=10;
        //     ListNode* node = new ListNode(temp1%10);
        // }
    }
};
