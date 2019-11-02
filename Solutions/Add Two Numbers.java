// problem link
// https://leetcode.com/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1, b = l2;
        ListNode head = new ListNode(0);
        ListNode h2 = head;
        int c = 0;
        while(a != null && b != null){
            ListNode t = new ListNode((a.val + b.val + c) % 10);
            c =  (a.val + b.val + c) / 10;
            h2.next = t;
            h2 = h2.next;
            a = a.next;
            b = b.next;
        }
        while(a != null){
            ListNode t = new ListNode((a.val + c) % 10);
            c = (a.val + c) / 10;
            h2.next = t;
            h2 = h2.next;
            a = a.next;
        }
        while(b != null){
            ListNode t = new ListNode((b.val + c) % 10);
            c = (b.val + c) / 10;
            h2.next = t;
            h2 = h2.next;
            b = b.next;
        }
        if(c == 1){
            ListNode t = new ListNode(c);
            h2.next = t;
        }
        return head.next;
    }
}