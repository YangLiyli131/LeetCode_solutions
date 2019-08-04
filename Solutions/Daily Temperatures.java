// problem link
//https://leetcode.com/problems/daily-temperatures/

/*
Create a stack to record the index that shall be updated
Store elements in the stack in a monotone decreasing order
Once a bigger value comes, pop all the previous indices, and put the difference between the index of this bigger value 
and the index of previous lower values in the positions of the result array based on the popped indices
*/

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        // create a stack to store day index
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < T.length; i++){
            while(!st.isEmpty() && T[st.peek()] < T[i]){
                int last = st.pop();
                res[last] = i - last;
            }
            st.push(i);
        }
        return res;
    }
}