// problem link
// https://leetcode.com/problems/add-two-numbers-ii/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode tail = new ListNode(0);
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();
            tail.val = sum % 10;
            ListNode t = new ListNode(sum / 10);
            sum /= 10;
            t.next = tail;
            tail = t;
        }
        return tail.val == 0? tail.next : tail;
    }
}