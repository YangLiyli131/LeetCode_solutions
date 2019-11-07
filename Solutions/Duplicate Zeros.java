// problem link
// https://leetcode.com/problems/duplicate-zeros/

class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for(int i : arr){
            if(i != 0) li.add(i);
        }
        int id = 0;
        int[] idx = new int[arr.length];
        int j = 0;
        for(int i : arr){
            //System.out.println(j);
            if(j > idx.length-1) break;
            if(i == 0){
                //idx[j] = 0;
                //idx[j+1] = 0;
                j += 2;
            }
            if(i != 0){
                idx[j] = li.get(id++);
                j++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = idx[i];
        }
    }
}