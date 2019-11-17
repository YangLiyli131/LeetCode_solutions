// problem link
// https://leetcode.com/problems/copy-list-with-random-pointer/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        HashMap<Node, Node> hm = new HashMap<>();
        Node cur = head;
        while(cur != null){
            hm.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            hm.get(cur).next = hm.get(cur.next);
            hm.get(cur).random = hm.get(cur.random);
            cur = cur.next;
        }
        return hm.get(head);
    }
}