package LinkedList;

import Tools.ListNode;

public class _143M_ReorderList {
    public static void reorderList(ListNode head) {

        // 找到中点
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse
        ListNode ReversePre = null;
        ListNode ReverseNext = null;
        ListNode ReverseCurrent = slow.next;

        // 断开
        slow.next = null;

        while (ReverseCurrent!=null){
            ReverseNext = ReverseCurrent.next;
            ReverseCurrent.next = ReversePre;
            ReversePre = ReverseCurrent;
            ReverseCurrent = ReverseNext;
        }

        // 拼接
        ListNode firstPart = head;
        ListNode secondPart = ReversePre;

        while (secondPart!=null){
            ListNode tem1 = firstPart.next;
            ListNode tem2 = secondPart.next;

            firstPart.next = secondPart;
            secondPart.next = tem1;
            firstPart = tem1;
            secondPart = tem2;
        }

    }

    public static void main(String[] args) {


    }
}
