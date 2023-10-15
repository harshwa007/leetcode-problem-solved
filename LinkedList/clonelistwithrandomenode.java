class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        // setting random link
        while (curr != null) {
            if (curr.next != null) {
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }
            curr = curr.next.next;
        }
        Node orig = head;
        Node copy = head.next;
        Node temp = copy;
        if (orig == null || orig.next == null) {
            return null;
        }
        while (orig != null) {
            orig.next = orig.next.next;
            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            orig = orig.next;
            copy = copy.next;
        }
        // Orig.next=null;
        return temp;
    }
}