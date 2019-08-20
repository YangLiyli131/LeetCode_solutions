// problem link
// https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while(a!= null && b!= null){
            if(a.val <= b.val){
                head.next = a;
                a = a.next;
            }else{
                head.next = b;
                b = b.next;
            }
            head = head.next;
        }
        if(a != null) head.next = a;
        if(b != null) head.next = b;
        return dummy.next;
    }
}