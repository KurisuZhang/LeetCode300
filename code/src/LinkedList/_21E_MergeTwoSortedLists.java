package LinkedList;

import Tools.ListNode;

public class _21E_MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {



        ListNode head = new ListNode();
        ListNode current = head;


        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        current.next = list1 != null ? list1 : list2;

        return head.next;

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        System.out.println(mergeTwoLists(list1,list2));

    }
}
