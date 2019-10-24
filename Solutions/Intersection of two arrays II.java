// problem link
// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] temp = new int[nums1.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                temp[idx++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[idx];
        for(int k = 0; k < idx; k++){
            res[k] = temp[k];
        }
        return res;
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums1){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }else{
                hm.put(i, hm.get(i)+1);
            }
        }
        ArrayList<Integer> t = new ArrayList<>();
        for(int j : nums2){
            if(hm.containsKey(j)){
                if(hm.get(j) > 1){
                    hm.put(j, hm.get(j)-1);
                }else{
                    hm.remove(j);
                }
                t.add(j);
            }
        }
        int[] res = new int[t.size()];
        int id = 0;
        for(int i : t) res[id++] = i;
        return res;
    }
}