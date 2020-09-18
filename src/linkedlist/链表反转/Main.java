package linkedlist.链表反转;

import linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        ListNode p = reverse(h1);
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

    private static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode now = head;
        while (now != null){
            ListNode temp = now.next;
            now.next = pre;
            pre = now;
            now = temp;
        }
        return pre;
    }
}
