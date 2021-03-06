package linkedlist.环形链表环的长度;

import linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode3;
        System.out.println(firstNode(listNode1));
    }

    private static int firstNode(ListNode head) {
        if (head == null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        int count = 1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                slow = slow.next;
                while (fast != slow){
                    slow = slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
