// problem link
// https://leetcode.com/problems/middle-of-the-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode tp = head;
        while(tp != null){
            tp = tp.next;
            n++;
        }
        int id = n/2;
        for(int i = 1; i <= id; i++){
            head = head.next;
        }
        return head;
    }
}