package linkedlist.合并两个有序链表;

import linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode q1 = new ListNode(3);
        ListNode q2 = new ListNode(5);
        h1.next = q1;
        q1.next = q2;
        ListNode h2 = new ListNode(2);
        ListNode p1 = new ListNode(4);
        ListNode p2 = new ListNode(6);
        h2.next = p1;
        p1.next = p2;
        ListNode listNode = mergeTwoLists(h1, h2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode h1,ListNode h2){
        ListNode listNode = new ListNode(-1);
        ListNode pre = listNode;
        while (h1 != null && h2 != null){
            if (h1.val <= h2.val){
                pre.next = h1;
                h1 = h1.next;
            }else {
                pre.next = h2;
                h2 = h2.next;
            }
            pre = pre.next;
        }
        pre.next = h1 == null ? h2 : h1;
        return listNode.next;
    }
}
