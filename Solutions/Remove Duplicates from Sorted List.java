// problem link
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dum = head;
        while(dum != null && dum.next != null){
            if(dum.next.val == dum.val) dum.next = dum.next.next;
            else dum = dum.next;
        }
        return head;
    }
}