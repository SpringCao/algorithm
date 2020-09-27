package hashmap.LRU;

import java.util.HashMap;
import java.util.Map;


public class Main {
    class DLinkNode{
        int key;
        int value;
        DLinkNode pre;
        DLinkNode next;
        public DLinkNode(){

        }
        public DLinkNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private DLinkNode head,tail;
    private Map<Integer,DLinkNode> map = new HashMap<>();
    private int size;
    private int capacity;
    public Main(int capacity){
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkNode();
        tail = new DLinkNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        DLinkNode node = map.get(key);
        if (node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key,int val){
        DLinkNode node = map.get(key);
        if (node == null){
            DLinkNode node1 = new DLinkNode(key,val);
            addToHead(node1);
            map.put(key,node1);
            size++;
            if (size > capacity){
                DLinkNode tailNode = removeTail();
                map.remove(tailNode.key);
                size--;
            }
        }else {
            node.value = val;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkNode node){
        node.pre = head;
        node.next = head.next;
        node.next.pre = node;
        head.next = node;
    }

    private void removeNode(DLinkNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(DLinkNode node){
        removeNode(node);
        addToHead(node);
    }

    private DLinkNode removeTail(){
        DLinkNode node = tail.pre;
        removeNode(node);
        return node;
    }

    public static void main(String[] args) {
        Main cache = new Main( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        System.out.println(cache.get(2));
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
