package LinkedList;

import Tools.ListNode;

public class _19M_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // slow fast
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // reverse
        ListNode tem = slow.next;
        slow.next = slow.next.next;
        tem = null;

        return dummy.next;
    }
}
