// problem link
// https://leetcode.com/problems/lru-cache/

class LRUCache {
    class DlinkedNode{
        int key;
        int value;
        DlinkedNode pre;
        DlinkedNode post;
    }
    private void addNode(DlinkedNode n){
        n.pre = head;
        n.post = head.post;
        head.post.pre = n;
        head.post = n;
    }
    private void removeNode(DlinkedNode n){
        DlinkedNode pre = n.pre;
        DlinkedNode post = n.post;
        pre.post = post;
        post.pre = pre;
    }
    private void moveToHead(DlinkedNode n){
        this.removeNode(n);
        this.addNode(n);
    }
    private DlinkedNode popTail(){
        DlinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }
    
    private HashMap<Integer,DlinkedNode> cache = new HashMap<>();
    private int count;
    private int capacity;
    private DlinkedNode head, tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        head = new DlinkedNode();
        tail = new DlinkedNode();
        head.pre = null;
        tail.post = null;
        head.post = tail;
        tail.pre = head;
    }
    
    public int get(int key) {
        DlinkedNode n = cache.get(key);
        if(n == null) return -1;
        this.moveToHead(n);
        return n.value;
    }
    
    public void put(int key, int value) {
        DlinkedNode n = cache.get(key);
        if(n == null){
            DlinkedNode newN = new DlinkedNode();
            newN.key = key;
            newN.value = value;
            this.cache.put(key, newN);
            this.addNode(newN);
            count++;
            if(count > capacity){
                DlinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                count--;
            }
        }else{
            n.value = value;
            this.moveToHead(n);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */