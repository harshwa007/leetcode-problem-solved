
public class deleteNodewithouthead {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // ListNode curr=head;
            // int count=0;
            // while(curr!=null)
            // {
            // curr=curr.next;
            // count++;
            // }
            // int len=count-n;
            // //if first element was to be removed
            // if(len==0)
            // {
            // head=head.next;
            // }
            // else{
            // ListNode prev=head;
            // while(len-1!=0)
            // {
            // prev=prev.next;
            // len--;
            // }
            // prev.next=prev.next.next;
            // }
            // return head;
            ListNode start = new ListNode();// dummy node
            start.next = head;
            ListNode fast = start;
            ListNode slow = start;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return start.next;
        }
    }
}
