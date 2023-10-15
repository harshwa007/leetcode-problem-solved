package LinkedList;

public class deletemiddlenode {
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head.next.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }

}
