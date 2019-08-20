// problem link
// https://leetcode.com/problems/rotate-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int leng = 0;
        ListNode tt = head;
        while(tt != null){
            leng++;
            tt = tt.next;
        }
        int num = k % leng;
        if(num == 0) return head;
        
        int dis = leng - num - 1;
        ListNode t = head;
        while(dis != 0){
            t = t.next;
            dis--;
        }
        // node t now is the end of the rotated list
        ListNode new_head = t.next;
        t.next = null;
        ListNode x = new_head;
        while(x.next != null){
            x = x.next;
        }
        x.next = head;
        return new_head;
    }
}