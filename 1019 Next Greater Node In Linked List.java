// problem link
// https://leetcode.com/problems/next-greater-node-in-linked-list/

/*
First transfer linked list to arrylist for better indexing
Create a stack to record the index that shall be updated
Store elements in the stack in a monotone decreasing order
Once a bigger value comes, pop all the previous indices, and put this bigger value 
in the positions of the result array based on the popped indices
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // create a stack to store the index
        Stack<Integer> st = new Stack<>();
        List<Integer> Li = new ArrayList<>();
        while(head != null){
            Li.add(head.val);
            head = head.next;
        }
        int[] res = new int[Li.size()];
        for(int i = 0; i < Li.size(); i++){
            while(!st.isEmpty() && Li.get(st.peek()) < Li.get(i)){
                res[st.pop()] = Li.get(i);
            }
            st.push(i);
        }
        return res;
    }
}