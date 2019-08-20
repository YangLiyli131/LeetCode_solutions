// problem link
// https://leetcode.com/problems/last-stone-weight/

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pg = new PriorityQueue<Integer>(stones.length,Collections.reverseOrder());
        for(int i : stones){
            pg.add(i);
        }
        while(pg.size() > 1){
            int a = pg.poll();
            int b = pg.poll();
            if(a != b) pg.add(a-b);
        }
        return pg.size() == 0? 0 : pg.peek();
    }
}