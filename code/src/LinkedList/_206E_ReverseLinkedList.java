package LinkedList;

import Tools.ListNode;

public class _206E_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;

        while (current != null) {
            next = current.next; // temporarily store the next node
            current.next = previous; // reverse the current node
            previous = current; // before we move to the next node, point previous to the current node
            current = next; // move on the next node
        }

        return previous;


    }
}
