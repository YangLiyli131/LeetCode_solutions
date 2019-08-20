// problem link
// https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode h1 = head;
        ListNode h2 = head;
        while(h2 != null && h2.next != null){
            h1 = h1.next;
            h2 = h2.next.next;
            if(h1 == h2){
                ListNode t = head;
                while(t != h1){
                    t = t.next;
                    h1 = h1.next;
                }
                return h1;
            }
        }
        return null;
    }
}