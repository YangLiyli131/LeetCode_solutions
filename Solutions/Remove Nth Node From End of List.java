// problem link
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode d11 = d1;
        d1.next = head;
        d2.next = head;
        int t = n;
        while(t != 0){
            d2 = d2.next;
            t--;
        }
        if(d2 == null) return null;
        while(d2.next != null){
            d1 = d1.next;
            d2 = d2.next;
        }
        d1.next = d1.next.next;
        return d11.next;
    }
}