package linkedlist.链表相交的第一个节点;

import linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        ListNode m1 = new ListNode(6);
        ListNode m2 = new ListNode(7);
        m1.next = h3;
        System.out.println(getIntersectionNode(h1,m1).val);
    }

    private static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if (headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null?headB:pA.next;
            pB = pB == null?headA:pB.next;
        }
        return pA;
    }
}
