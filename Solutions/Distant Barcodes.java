// problem link
// https://leetcode.com/problems/distant-barcodes/

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : barcodes) hm.put(i, hm.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((i,j) -> hm.get(j) - hm.get(i));
        pq.addAll(hm.keySet());
        int[] res = new int[barcodes.length];
        int id = 0;
        while(!pq.isEmpty()){
            int t = pq.poll(), freq = hm.remove(t);
            while(freq-- != 0){
                if(id >= barcodes.length) id = 1;
                res[id] = t;
                id += 2;
            }
        }
        return res;
    }
}