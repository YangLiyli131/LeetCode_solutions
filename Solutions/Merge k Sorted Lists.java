// problem link
// https://leetcode.com/problems/merge-k-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // altogether K lists
        if(lists == null || lists.length == 0) return null;
        int K = lists.length;
        // divide and conquer, merge pairs of lists step by step, complexity O(nklogk)
        int last = K - 1;
        while(last != 0){
            int i = 0, j = last;
            while(i < j){
                lists[i] = merge2Lists(lists[i], lists[j]);
                i++;
                j--;                
                if(i >= j) last = j;
            }
        }
        return lists[0];
    }
    private ListNode merge2Lists(ListNode a, ListNode b){
        ListNode dd = new ListNode(0);
        ListNode d = dd;
        ListNode l1 = a, l2 = b;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                d.next = l1;
                l1 = l1.next;
            }else{
                d.next = l2;
                l2 = l2.next;
            }
            d = d.next;
        }
        if(l1 != null){
            d.next = l1;
        }
        if(l2 != null){
            d.next = l2;
        }
        return dd.next;
    }
}