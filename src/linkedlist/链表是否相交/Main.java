package linkedlist.链表是否相交;


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
        m1.next = m2;
        System.out.println(isIntersect(h1, m1));
    }

    private static  boolean isIntersect(ListNode head1,ListNode head2){
        if (head1 == null || head2 == null){
            return true;
        }
        ListNode p = head1;
        ListNode q = head2;
        while (p.next != null){
            p = p.next;
        }
        while (q.next != null){
            q = q.next;
        }
        return p == q;
    }
}
