// problem link
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

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
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;
        boolean flag = false;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                flag = true;
                cur = cur.next;
            }else{
                cur = cur.next;
                if(!flag){
                    pre = pre.next;
                }
                pre.next = cur;
                flag = false;
            }
        }
        if(flag) pre.next = null;
        return dummy.next;
    }
}