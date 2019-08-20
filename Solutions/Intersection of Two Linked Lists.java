// problem link
// https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int LA = 0;
        int LB = 0;
        ListNode d1 = headA;
        ListNode d2 = headB;
        while(d1 != null){
            LA++;
            d1 = d1.next;
        }
        while(d2 != null){
            LB++;
            d2 = d2.next;
        }
        int dd = LA - LB;
        if(dd < 0){
            while(dd != 0){
                ListNode tt = new ListNode(0);
                tt.next = headA;
                headA = tt;
                dd++;
            }
        }
        if(dd > 0){
            while(dd != 0){
                ListNode tt = new ListNode(0);
                tt.next = headB;
                headB = tt;
                dd--;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}