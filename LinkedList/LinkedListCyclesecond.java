package LinkedList;

public class LinkedListCyclesecond {
    public class Solution {

        public ListNode detectCycle(ListNode head) {
            ListNode start = head;
            ListNode Meet = hasCycle(head);
            if (Meet == null || Meet.next == null) {
                return null;
            }
            while (start != Meet) {
                start = start.next;
                Meet = Meet.next;
            }
            return start;
            // if(start!=null)
            // {
            // return start;
            // }
            // else{
            // return null;
            // }
        }

        public ListNode hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return slow;
                }
            }
            return null;
        }
    }
}
