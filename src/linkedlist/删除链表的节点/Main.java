package linkedlist.删除链表的节点;

import linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        ListNode p = deleteNode(h1,1);
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

    private static ListNode deleteNode(ListNode head,int val){
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode p = pre;
        ListNode q = head;
        while (q != null){
            if (q.val == val){
                break;
            }
            p = p.next;
            q = q.next;
        }
        p.next = q.next;
        return pre.next;
    }
}
