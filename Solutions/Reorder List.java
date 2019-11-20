// problem link
// https://leetcode.com/problems/reorder-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secHead = slow.next;
        slow.next = null;
        
        ListNode rH = rev(secHead);
        ListNode lH = head;
        while(lH != null && rH != null){
            ListNode temp = lH.next;
            lH.next = rH;
            rH = rH.next;
            lH.next.next = temp;
            lH = temp;
        }       
    }
    private ListNode rev(ListNode n){
        ListNode pre = null, cur = n, next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}